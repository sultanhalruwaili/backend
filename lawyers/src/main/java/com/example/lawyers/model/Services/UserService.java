package com.example.lawyers.model.Services;

import com.example.lawyers.model.Entities.Users;
import com.example.lawyers.model.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    //Object For Repository Class To Take All Information From DB
    private UserRepository userRepository;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUser(String email) {
        return userRepository.findById(email);
    }


    public Integer addNewUser(Users users){
        if(userRepository.existsById(users.getEmail())){
            return 0;
        }
        else{
            userRepository.save(users);
            return 1;
        }

    }

    public String checkLogin(String email,String password){
        if(userRepository.existsById(email)){
            String pass= userRepository.findPassword(email);

            if(pass.equals(password)){
                String role= userRepository.findRoles(email);

                return "authenticated"+ role;
            }
            else{
                return "password Does not match";
            }

        }
        return "please sign up";
    }

    public void deleteUser(String email) {
        userRepository.deleteById(email);}
}
