package com.meetingmedical.medical.controlleur;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meetingmedical.medical.dao.AppointmentRepsitory;
import com.meetingmedical.medical.dao.DoctorRepositroy;
import com.meetingmedical.medical.dao.PatientRepository;
import com.meetingmedical.medical.dao.UserRepository;
import com.meetingmedical.medical.entities.Appointment;
import com.meetingmedical.medical.entities.Doctor;
import com.meetingmedical.medical.entities.Patient;
import com.meetingmedical.medical.entities.User;


@Controller
public class Controlleur {
	
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	UserRepository  userRepository;
	@Autowired
	DoctorRepositroy doctorRepositroy;
	@Autowired
	AppointmentRepsitory appointmentRepsitory;
	Patient patient;
	Doctor doct;
	
	@RequestMapping("/doctorProfile")
	public String docterprofil(Model model,Long id){
		Optional<Doctor> doctor= doctorRepositroy.findById(id) ;
		System.out.println(doctor.get());
		doct=doctor.get();
		model.addAttribute("doctor",doctor.get());
		patient = patientRepository.getById((long) 1);
		model.addAttribute("patient",patient);
		model.addAttribute("apointment",new Appointment());
		return "docterprofil";
	}
	@GetMapping("/login")
	public String login(Model model){
		Patient patient = new Patient();
		patient.setUser(new User());
		patient.getUser().setRoles("patient");
		model.addAttribute("patient",patient  );
		model.addAttribute("user",patient.getUser());
		return "sign";
	}

	@PostMapping("/signup")
	public String signup(Patient patient,User user){
		user.setEnabled(true);
		user.setRoles("ROLE_PATIENT");
		patient.setUser(user);
		
		userRepository.save(user);
		patientRepository.save(patient);
		return "sign";
	}
	
	@RequestMapping("/doctors")
	public String index(Model model){
		List<Doctor> doctors = doctorRepositroy.findAll();
		model.addAttribute("doctors", doctors);
		return "doctors";
	}
	
	@PostMapping("/booking")
	public String booking(Model model,Appointment appointment){
		
		appointment.setIdD(doct.getId());
		appointment.setIdP((long) 1);
		appointmentRepsitory.save(appointment);
		List<Doctor> doctors = doctorRepositroy.findAll();
		model.addAttribute("doctors", doctors);
		return "doctors";
	}

}
