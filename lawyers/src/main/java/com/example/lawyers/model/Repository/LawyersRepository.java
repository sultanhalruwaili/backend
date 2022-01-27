package com.example.lawyers.model.Repository;

import com.example.lawyers.model.Entities.Lawyers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LawyersRepository extends JpaRepository<Lawyers, Integer> {
}
