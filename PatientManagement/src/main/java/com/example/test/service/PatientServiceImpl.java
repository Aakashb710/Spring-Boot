package com.example.test.service;

import com.example.test.dao.PatientDao;
import com.example.test.dao.PatientDaoImpl;
import com.example.test.domain.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService
{

    @Override
    public List<Patient> createPatient(Patient patient) {
        PatientDao pd = new PatientDaoImpl();
        List<Patient> ll =pd.createPatient(patient);
        return ll;
    }

    @Override
    public List<Patient> getPatients() {
        PatientDao pd = new PatientDaoImpl();
        List<Patient> ll = pd.getPatients();
        return ll;
    }
}
