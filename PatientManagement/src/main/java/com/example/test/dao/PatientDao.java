package com.example.test.dao;

import com.example.test.domain.Patient;

import java.util.List;

public interface PatientDao {
    List<Patient> createPatient(Patient p);
    List<Patient> getPatients();
}
