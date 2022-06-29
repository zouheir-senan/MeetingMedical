package com.meetingmedical.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetingmedical.medical.entities.Appointment;

public interface AppointmentRepsitory extends JpaRepository<Appointment, Long> {

}
