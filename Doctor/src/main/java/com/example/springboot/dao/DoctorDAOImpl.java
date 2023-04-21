package com.example.springboot.dao;

import com.example.springboot.entitiy.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorDAOImpl implements DoctorDAO{


        private static List<Doctor> doctors = new ArrayList<>();

        static{
            doctors.add(new Doctor(1, "Elizabeth", "MBBS", 4.2, "Cardiologist", 750.));
            doctors.add(new Doctor(2, "Michael", "MBBS", 2.0, "Dermatologist", 1500.));
            doctors.add(new Doctor(3, "Charlotte", "MBBS", 3.1, "Pediatrics", 200.));
            doctors.add(new Doctor(4, "Lucas", "BDS", 1.9, "Dentist", 250.));
        }

        public List<Doctor> list() {
            //Fill your code here
            return  doctors;
        }


}
