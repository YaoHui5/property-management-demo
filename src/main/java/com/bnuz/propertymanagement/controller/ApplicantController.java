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

    //自动注入接口
    @Autowired
    private ApplicantService applicantService;

    //获取所有申请人信息
    @GetMapping("/applicant")
    public List<Applicant> getAllApplicant(){
        return applicantService.getAll();
    }

    //添加申请人
    @PostMapping("/applicant")
    public void addApplicant(@RequestBody Applicant applicant){
        applicantService.addApplicant(applicant);
    }

    //根据Id获取申请人信息
    @GetMapping("/applicant/{id}")
    public Applicant getApplicantById(@PathVariable("id") int id){
        return applicantService.getApplicantById(id);
    }

    //根据Id更新申请人信息
    @PostMapping("/applicant/{id}")
    public void updateApplicantById(@PathVariable("id")int id,@RequestBody Applicant applicant){
        applicant.setId(id);
        applicantService.updateApplicantById(applicant);
    }

    //根据Id删除申请人信息
    @GetMapping("")
    public void deleteApplicant(@PathVariable("id") int id){
        applicantService.deleteApplicantById(id);
    }

}
