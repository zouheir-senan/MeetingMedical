package com.meetingmedical.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetingmedical.medical.entities.Doctor;

public interface DoctorRepositroy extends JpaRepository<Doctor, Long> {

}
