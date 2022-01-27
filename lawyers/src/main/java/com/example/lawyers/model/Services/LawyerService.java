package com.example.lawyers.model.Services;

import com.example.lawyers.model.Entities.Lawyers;
import com.example.lawyers.model.Repository.LawyersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LawyerService {


    //Object For Repository Class To Take All Information From DB
    private LawyersRepository lawyersRepository;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public LawyerService(LawyersRepository lawyersRepository) {
        this.lawyersRepository = lawyersRepository;
    }

    public List<Lawyers> getLawyers() {
        return lawyersRepository.findAll();

    }

    public Optional<Lawyers> getLawyer(Integer lawyer_Id) {
        return lawyersRepository.findById(lawyer_Id);
    }

    public void addNewLawyer(Lawyers lawyers) {
        lawyersRepository.save(lawyers);
    }

    public void deleteLawyer(Integer lawyer_Id) {
        lawyersRepository.deleteById(lawyer_Id);
    }
}
