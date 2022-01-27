package com.example.lawyers.model.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class UserLawyerService {

    @Id
    @GeneratedValue
    private int id;

//     RelationShip MANY To ONE with lawyers
    @ManyToOne (cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "lawyer_Id")
    private Lawyers lawyers;

    // RelationShip MANY To ONE with User
    @ManyToOne (cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "user_Id")
    private Users users;

    // RelationShip MANY To ONE with Service
    @ManyToOne (cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "service_Id")
    private Services services;


    //Constructor with initial Attr
    public UserLawyerService(int id, Lawyers lawyers, Users users, Services services) {
        this.id = id;
        this.lawyers = lawyers;
        this.users = users;
        this.services = services;
    }

}
