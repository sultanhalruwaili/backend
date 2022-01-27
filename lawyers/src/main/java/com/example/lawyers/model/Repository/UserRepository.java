package com.example.lawyers.model.Repository;

import com.example.lawyers.model.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,String> {

    @Query("SELECT roles FROM Users  where email = :email")
    String findRoles(@Param("email") String email);

    @Query("SELECT password FROM Users  where email = :email")
    String findPassword(@Param("email") String email);
}
