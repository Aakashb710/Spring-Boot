package com.example.test.dao;

import com.example.test.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao
{


    private static List<Patient> ll = new ArrayList<>();
    PatientDao pd = new PatientDaoImpl();

    static {
        ll.add(new Patient(1L, "Swathy", "9876567234", "swathy@gmail.com", "31-07-1989"));
        ll.add(new Patient(2L, "Vanmathi", "9873877234", "vanmathi@gmail.com", "23-04-1992"));
        ll.add(new Patient(3L, "Kevin", "9823641234", "kevin@gmail.com", "01-04-2000"));
    }
    @Override
    public List<Patient> createPatient(Patient p) {
        ll.add(p);
        return ll;
    }

    @Override
    public List<Patient> getPatients() {
        return null;
    }
}
