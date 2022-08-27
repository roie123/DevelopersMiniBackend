package com.example.DeveloperAndMistakes.repo;

import com.example.DeveloperAndMistakes.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepo extends JpaRepository<Developer,Long> {
}
