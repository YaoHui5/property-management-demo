package com.bnuz.propertymanagement.controller;


import com.bnuz.propertymanagement.mapper.ApplicantMapper;
import com.bnuz.propertymanagement.model.Applicant;
import com.bnuz.propertymanagement.service.ApplicantService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api()
@RestController
@RequestMapping("/hello")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping("/list")
    public List<Applicant> getAllApplicant(){
        return applicantService.getAll();
    }

    @PostMapping("/add")
    public void addApplicant(@RequestBody Applicant applicant){
        applicantService.addApplicant(applicant);
    }

    @GetMapping("/get")
    public Applicant getApplicantById(@PathVariable("id") int id){
        return applicantService.getApplicantById(id);
    }

    @PostMapping("/update")
    public void updateApplicantById(@PathVariable("id")int id,@RequestBody Applicant applicant){
        applicant.setId(id);
        applicantService.updateApplicantById(applicant);
    }

    @GetMapping("/delete")
    public void deleteApplicant(@PathVariable("id") int id){
        applicantService.deleteApplicantById(id);
    }

}
