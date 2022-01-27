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
public class Users {

    @Id
    @Column(updatable = false)
    private String email;
    @Column(updatable = false ,nullable = false)
    private String password;
    private String roles;

    // RelationShip ONE To MANY with UserLawyerService
    @OneToMany (mappedBy = "users",cascade = {CascadeType.PERSIST ,CascadeType.MERGE})
    @JsonIgnore
    private Set<UserLawyerService> userLawyerServices;

    //Constructor with initial Attr
    public Users(String email, String password, String roles) {
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
