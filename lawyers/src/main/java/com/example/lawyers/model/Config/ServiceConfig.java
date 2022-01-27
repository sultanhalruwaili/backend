package com.example.lawyers.model.Config;

import com.example.lawyers.model.Entities.Services;
import com.example.lawyers.model.Repository.ServiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ServiceConfig {


    // Bean definition is the objects that form the backbone of your application and that are managed by the Spring IoC container
    @Bean
    CommandLineRunner commandLineRunner1(ServiceRepository repository){
        return args -> {
            Services Consultations = new Services(1,"Consultations");
            Services Arbitration = new Services(2,"Arbitration");
            Services Pleadings = new Services(3,"Pleadings");

            repository.saveAll(List.of(Arbitration,Consultations,Pleadings));

        };
    }
}
