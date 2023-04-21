package com.example.test.controllee;

import com.example.test.domain.Patient;
import com.example.test.service.PatientService;
import com.example.test.service.PatientServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PatientController
{

    PatientService ps = new PatientServiceImpl();

    @PostMapping( "/patient/list")
    public List<Patient> listPatients(){
        //Fill the code
        List<Patient> ll = ps.getPatients();
        return ll;

    }

    //Fill the code

   @GetMapping("/patient/list")
    public List<Patient> createPatient(@RequestBody Patient patient){
        //Fill the code
        List<Patient> ll = ps.createPatient(patient);
        return ll;
    }
}
