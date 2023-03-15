package com.bnuz.propertymanagement.mapper;

import com.bnuz.propertymanagement.model.Applicant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ApplicantMapper {

    //添加申请人
    public void add(Applicant applicant);

    //根据申请人id删除申请人信息
    public void deleteById(int id);

    //根据申请人id更新申请人信息
    public void updateById(Applicant applicant);

    @Select("select * from applicant")
    //查询所有申请人的信息
    public List<Applicant> getAll();

    //根据申请人id查询申请人信息
    public Applicant getById(int id);


}
