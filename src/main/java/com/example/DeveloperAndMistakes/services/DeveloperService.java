package com.example.DeveloperAndMistakes.services;

import com.example.DeveloperAndMistakes.model.Developer;
import com.example.DeveloperAndMistakes.model.Mistake;
import com.example.DeveloperAndMistakes.repo.DeveloperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeveloperService {

    private final DeveloperRepo developerRepo;

    @Autowired
    public DeveloperService(DeveloperRepo developerRepo) {
        this.developerRepo = developerRepo;
    }

    public Developer addDeveloper(Developer developer){
        return developerRepo.save(developer);
    }
    public Developer updateDeveloper(Developer developer){
        return developerRepo.save(developer);
    }
    public Developer addMistake(Long id, Mistake mistake){
        Developer developer = developerRepo.findById(id).orElseThrow();
        developer.addMistake(mistake);
        return  developerRepo.save(developer);
    }
    public List<Developer> findAllDevelopers(){
        return developerRepo.findAll();
    }
    public Developer findById(long id){
        return developerRepo.findById(id).orElseThrow();
    }
    public void deleteDeveloper(long id){
        developerRepo.deleteById(id);
    }


}
