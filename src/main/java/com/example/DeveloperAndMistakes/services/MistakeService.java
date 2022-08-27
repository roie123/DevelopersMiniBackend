package com.example.DeveloperAndMistakes.services;

import com.example.DeveloperAndMistakes.model.Developer;
import com.example.DeveloperAndMistakes.model.Mistake;
import com.example.DeveloperAndMistakes.repo.MistakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MistakeService {
    private final MistakeRepo mistakeRepo;

    @Autowired
    public MistakeService(MistakeRepo mistakeRepo) {
        this.mistakeRepo = mistakeRepo;
    }

    public Mistake addMistake(Mistake mistake){
        return mistakeRepo.save(mistake);
    }
    public Mistake updateMistake(Mistake mistake){
        return mistakeRepo.save(mistake);
    }
    public List<Mistake> findAllMistakes(){
        return mistakeRepo.findAll();
    }
    public Optional<Mistake> findById(long id){
        return mistakeRepo.findById(id);
    }
    public void deleteMistake(long id){
        mistakeRepo.deleteById(id);
    }
}
