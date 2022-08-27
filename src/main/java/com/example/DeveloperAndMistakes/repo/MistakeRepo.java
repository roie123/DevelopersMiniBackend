package com.example.DeveloperAndMistakes.repo;

import com.example.DeveloperAndMistakes.model.Mistake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MistakeRepo extends JpaRepository<Mistake,Long> {
}
