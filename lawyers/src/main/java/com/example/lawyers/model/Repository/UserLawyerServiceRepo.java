package com.example.lawyers.model.Repository;


import com.example.lawyers.model.Entities.UserLawyerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLawyerServiceRepo extends JpaRepository<UserLawyerService,Integer> {

    @Query("SELECT lawyers.lawyer_Id FROM UserLawyerService WHERE services.service_ID = :service_ID")
    List<Integer> findLawyers(@Param("service_ID") Integer service_ID);

}
