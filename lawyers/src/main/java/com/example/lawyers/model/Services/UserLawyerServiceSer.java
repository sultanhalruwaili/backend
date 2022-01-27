package com.example.lawyers.model.Services;

import com.example.lawyers.model.Entities.UserLawyerService;
import com.example.lawyers.model.Repository.UserLawyerServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserLawyerServiceSer {

    //Object For Repository Class To Take All Information From DB
    private UserLawyerServiceRepo userLawyerServiceRepo;


    //Autowiring feature of spring framework To enables you to inject the object dependency implicitly.
    @Autowired
    public UserLawyerServiceSer(UserLawyerServiceRepo userLawyerServiceRepo) {
        this.userLawyerServiceRepo = userLawyerServiceRepo;
    }

    public List<UserLawyerService> getUserLawyerServices() {
        return userLawyerServiceRepo.findAll();

    }

    public Optional<UserLawyerService> getUserLawyerService(Integer id) {
        return userLawyerServiceRepo.findById(id);
    }

    public List<Integer> getLawyerService(Integer service_Id) {
        return userLawyerServiceRepo.findLawyers(service_Id);
    }

    public void addNewUserLawyerService(UserLawyerService userLawyerService) {
        userLawyerServiceRepo.save(userLawyerService);
    }

}
