package com.example.lawyers.model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int service_ID;
    private String service_Name;


    // RelationShip ONE To MANY with UserLawyerService
    @OneToMany (mappedBy = "services",cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
    @JsonIgnore
    private Set<UserLawyerService> userLawyerServices;

    // Constructor with initial Attr
    public Services(int service_ID, String service_Name) {
        this.service_ID = service_ID;
        this.service_Name = service_Name;
//        this.userLawyerServices = userLawyerServices;
    }
}
