package com.example.lawyers.controller;


import com.example.lawyers.model.Entities.Services;
import com.example.lawyers.model.Services.ServiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ServiceController {


    //Object For Service Service Class
    private ServiceServices serviceServices;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public ServiceController(ServiceServices serviceServices) {
        this.serviceServices = serviceServices;
    }

    // API Method GET,POST,DELETE
    @GetMapping(path = "service")
    public List<Services> getServices() {
        return serviceServices.getServices();
    }

    @GetMapping(path = "{service_ID}")
    public Optional<Services> getService(@PathVariable(name = "service_ID") Integer service_ID) {
        return serviceServices.getService(service_ID);
    }

    @PostMapping("/service/add")
    public void registerNewService(@RequestBody Services services){
        serviceServices.addNewService(services);
    }

}