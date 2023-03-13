package com.bnuz.propertymanagement.service.impl;

import com.bnuz.propertymanagement.mapper.ApplicantMapper;
import com.bnuz.propertymanagement.model.Applicant;
import com.bnuz.propertymanagement.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private  ApplicantService applicantService;

    //查询所有申请人信息
    @Override
    public List<Applicant> getAll(){
        return applicantService.getAll();
    };

    //根据id查询申请人信息
    public Applicant getApplicantById(int id){
        return applicantService.getApplicantById(id);
    };

    //根据id删除申请人信息
    public void deleteApplicantById(int id){
         applicantService.deleteApplicantById(id);
    };

    //添加申请人
    public void addApplicant(Applicant applicant){
         applicantService.addApplicant(applicant);
    };

    //根据id更新申请人的信息
    public void updateApplicantById(Applicant applicant){
         applicantService.updateApplicantById(applicant);
    };

}
