package com.bnuz.propertymanagement.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
@Component
public class Applicant {

    private int id;

    private String name;

    private String  id_card;

    private String phone;

    private short gender;

    private String working_address;

    private String mate_name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getWorking_address() {
        return working_address;
    }

    public void setWorking_address(String working_address) {
        this.working_address = working_address;
    }

    public String getMate_name() {
        return mate_name;
    }

    public void setMate_name(String mate_name) {
        this.mate_name = mate_name;
    }


}
