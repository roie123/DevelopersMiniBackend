package com.example.DeveloperAndMistakes.controller;


import com.example.DeveloperAndMistakes.model.Developer;
import com.example.DeveloperAndMistakes.model.Mistake;
import com.example.DeveloperAndMistakes.services.DeveloperService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/developers")
public class DeveloperController {

    private final DeveloperService developerService;

    public DeveloperController(DeveloperService developerService) {
        this.developerService = developerService;
    }

    @GetMapping//the original path shows all the developers
    @CrossOrigin
    public ResponseEntity<List<Developer>> getAllDevelopers(){
        List<Developer> developers = developerService.findAllDevelopers();
        return new ResponseEntity<>(developers, HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping(path = "/find/{id}")
    public ResponseEntity<Developer> findByid(@PathVariable ("id") Long id){
        Developer developer = developerService.findById(id);
        return new ResponseEntity<>(developer,HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(path = "/add_mistake/{id}")
    public ResponseEntity<Developer> addDeveloper(@PathVariable("id") Long id,@RequestBody Mistake mistake){
        Developer developer = developerService.addMistake(id, mistake);
        return new ResponseEntity<>(developer,HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path = "/add")
    public ResponseEntity<Developer> addDeveloper(@RequestBody Developer developer){
        Developer developer1 = developerService.addDeveloper(developer);
        return new ResponseEntity<>(developer1,HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping(path = "/update")
    public ResponseEntity<Developer> updateDeveloper(Developer developer){
        developerService.updateDeveloper(developer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> deleteDeveloper(@PathVariable("id") Long id){
        developerService.deleteDeveloper(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
