package com.bnuz.propertymanagement.service;

import com.bnuz.propertymanagement.model.Applicant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicantService {

    public List<Applicant> getAll();    //查询所有申请人信息

    public Applicant getApplicantById(int id);  //根据id查询申请人信息

    public void deleteApplicantById(int id);    //根据id删除申请人信息

    public void addApplicant(Applicant applicant);       //添加申请人

    public void updateApplicantById(Applicant applicant);   //根据id更新申请人的信息

}
