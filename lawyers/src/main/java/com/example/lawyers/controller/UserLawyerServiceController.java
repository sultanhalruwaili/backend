package com.example.lawyers.controller;

import com.example.lawyers.model.Entities.UserLawyerService;
import com.example.lawyers.model.Services.UserLawyerServiceSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserLawyerServiceController {

    //Object For Service UserLawyerService Class
    private UserLawyerServiceSer userLawyerServiceSer;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public UserLawyerServiceController(UserLawyerServiceSer userLawyerServiceSer) {
        this.userLawyerServiceSer = userLawyerServiceSer;
    }


    // API Method GET,POST,DELETE
    @GetMapping(path = "/UserLawyerService")
    public List<UserLawyerService> getUserLawyerServices() {
        return userLawyerServiceSer.getUserLawyerServices();
    }

    @GetMapping(path = "{id}")
    public Optional<UserLawyerService> getUserLawyerService(@PathVariable(name = "id") Integer id) {
        return userLawyerServiceSer.getUserLawyerService(id);
    }

    //Query to get All lawyer with this service
    @GetMapping(path = "api/service/lawyer")
    public List<Integer> getLawyerService(@RequestParam (name = "service_Id") Integer service_ID) {
        return userLawyerServiceSer.getLawyerService(service_ID);
    }

    @PostMapping("/UserLawyerService/add")
    public void registerNewUserLawyerService(@RequestBody UserLawyerService userLawyerService){
        userLawyerServiceSer.addNewUserLawyerService(userLawyerService);
    }

}