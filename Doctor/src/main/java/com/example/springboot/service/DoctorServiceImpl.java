package com.example.springboot.service;

import com.example.springboot.dao.DoctorDAO;
import com.example.springboot.dao.DoctorDAOImpl;
import com.example.springboot.entitiy.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl
{
    @Autowired
    private DoctorDAO dr;

    public List<Doctor> list(){

        //Fill your code here
        List<Doctor> ll = dr.list();
        return ll;

    }
}
