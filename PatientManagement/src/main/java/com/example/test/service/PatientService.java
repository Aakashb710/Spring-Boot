package com.example.test.service;

import com.example.test.domain.Patient;

import java.util.List;

public interface PatientService
{
    List<Patient> createPatient(Patient patient);
    List<Patient> getPatients();
}
