package com.example.lawyers.controller;

import com.example.lawyers.model.Entities.Lawyers;
import com.example.lawyers.model.Services.LawyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
public class LawyersController {


    //Object For Service Lawyer
    private LawyerService lawyerService;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public LawyersController(LawyerService lawyerService) {
        this.lawyerService = lawyerService;
    }



    // API Method GET,POST,DELETE
    @GetMapping (path = "lawyers")
    public List<Lawyers> getLawyers() {
        return lawyerService.getLawyers();
    }

    @GetMapping(path = "{lawyerId}")
    public Optional<Lawyers> getLawyer(@PathVariable(name = "lawyerId") Integer lawyerId) {
        return lawyerService.getLawyer(lawyerId);
    }

    @PostMapping("api/lawyers/add")
    public void registerNewLawyer(@RequestBody Lawyers lawyers){
        lawyerService.addNewLawyer(lawyers);
    }

    @DeleteMapping(path = "api/delete/{lawyerId}")
    public void deleteLawyer(@PathVariable ("lawyerId") Integer lawyerId){
        lawyerService.deleteLawyer(lawyerId);
    }

}