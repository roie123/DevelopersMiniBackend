package com.example.DeveloperAndMistakes.model;

import javax.persistence.*;

@Entity
public class Mistake {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    @ManyToOne
private Developer developer;

    public String getDescription() {
        return description;
    }

    public Mistake() {
    }

    public Mistake(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
