package com.example.lawyers.model.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lawyers {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lawyer_Id;
    private String lawyer_Name;
    private String img;
    private String service;
    private String date;
    private String email;
    private int phone;
    private String address;


    // RelationShip ONE To MANY with UserLawyerService
    @OneToMany (mappedBy = "lawyers",cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
    @JsonIgnore
    private Set <UserLawyerService> userLawyerServices;



    //Constructor with initial Attr

    public Lawyers(int lawyer_Id, String lawyer_Name, String img, String service, String date, String email, int phone, String address) {
        this.lawyer_Id = lawyer_Id;
        this.lawyer_Name = lawyer_Name;
        this.img = img;
        this.service = service;
        this.date = date;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }


    // Empty Constructor
//    public Lawyers() {
//    }


    //setter and getter method
//    public int getLawyer_Id() {
//        return lawyer_Id;
//    }
//
//    public void setLawyer_Id(int lawyer_Id) {
//        this.lawyer_Id = lawyer_Id;
//    }
//
//    public String getLawyer_Name() {
//        return lawyer_Name;
//    }
//
//    public void setLawyer_Name(String lawyer_Name) {
//        this.lawyer_Name = lawyer_Name;
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Set<UserLawyerService> getUserLawyerServices() {
//        return userLawyerServices;
//    }
//
//    public void setUserLawyerServices(Set<UserLawyerService> userLawyerServices) {
//        this.userLawyerServices = userLawyerServices;
//    }
}
