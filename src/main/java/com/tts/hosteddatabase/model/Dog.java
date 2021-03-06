package com.tts.hosteddatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

//    private Integer dogRating;

    public void setId(Long id) {
        this.id = id;
    }

//    public Integer getDogRating() {
//        return dogRating;
//    }

//    public void setDogRating(Integer dogRating) {
//        this.dogRating = dogRating;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }
}
