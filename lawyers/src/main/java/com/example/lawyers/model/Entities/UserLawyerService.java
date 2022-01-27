package com.example.lawyers.model.Entities;

import javax.persistence.*;

@Entity
@Table
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


    // Empty Constructor
    public UserLawyerService() {
    }


    // Setter and Getter Method


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Lawyers getLawyers() {
        return lawyers;
    }

    public void setLawyers(Lawyers lawyers) {
        this.lawyers = lawyers;
    }

    public Users getUser() {
        return users;
    }

    public void setUser(Users users) {
        this.users = users;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
