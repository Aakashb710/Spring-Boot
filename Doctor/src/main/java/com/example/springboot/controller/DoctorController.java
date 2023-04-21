package com.example.springboot.controller;


import com.example.springboot.dao.DoctorDAO;
import com.example.springboot.entitiy.Doctor;
import com.example.springboot.service.DoctorService;
import com.example.springboot.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController
{
    @Autowired
    private DoctorDAO dr;


    @GetMapping("/doctor/list")
    public List<Doctor> getDoctors(){
        //Fill your code here

        List<Doctor> ll = dr.list();
        return ll;
    }
}
