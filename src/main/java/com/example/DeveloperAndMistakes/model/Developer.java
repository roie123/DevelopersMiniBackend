package com.example.DeveloperAndMistakes.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Developer {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    private Set<Mistake> mistakes=new HashSet<>();

    public String getName() {
        return name;
    }
    public void addMistake(Mistake mistake){
        this.mistakes.add(mistake);
    }
    public Developer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Set<Mistake> getMistakes() {
        return mistakes;
    }

    public void setMistakes(Set<Mistake> mistakes) {
        this.mistakes = mistakes;
    }

    public Developer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
