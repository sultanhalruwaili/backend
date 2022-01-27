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

}
