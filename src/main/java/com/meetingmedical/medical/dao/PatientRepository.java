package com.meetingmedical.medical.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetingmedical.medical.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
