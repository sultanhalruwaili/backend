package com.example.lawyers.controller;

import com.example.lawyers.model.Entities.Users;
import com.example.lawyers.model.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    //Object For Service User
    private UserService userServices;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public UserController(UserService userService) {
        this.userServices = userService;
    }


    // API Method GET,POST,DELETE
    @GetMapping(path = "/api/users")
    public List<Users> getUsers() {
        return userServices.getUsers();
    }

    @GetMapping(path = "{email}")
    public Optional<Users> getUser(@PathVariable(name = "email") String email) {
        return userServices.getUser(email);
    }
    @GetMapping("api/user/login")
    public String CheckLogin(@RequestParam(name="email") String email, @RequestParam(name="password")String password){

        return userServices.checkLogin(email,password);
    }

    @PostMapping("api/user/add")
    @ResponseBody
    public String registerNewUser(@RequestBody Users users){
        int result = userServices.addNewUser(users);
        if(result == 0){
            return "username already exist";
        }
        else{
            return "login successfully";
        }
    }
    @DeleteMapping(path = "api/user/delete/{email}")
    public void deleteUser(@PathVariable ("email") String email){
        userServices.deleteUser(email);
    }


}