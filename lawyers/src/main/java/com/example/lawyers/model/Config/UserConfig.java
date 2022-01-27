package com.example.lawyers.model.Config;
import com.example.lawyers.model.Entities.Services;
import com.example.lawyers.model.Entities.Users;
import com.example.lawyers.model.Repository.ServiceRepository;
import com.example.lawyers.model.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner3(UserRepository repository){
        return args -> {
            Users userAdmin = new Users("sultanh@gmail.com","1234","ADMIN");

            repository.saveAll(List.of(userAdmin));

        };
    }
}
