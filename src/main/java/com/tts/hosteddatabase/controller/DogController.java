package com.tts.hosteddatabase.controller;

import com.tts.hosteddatabase.model.Dog;
import com.tts.hosteddatabase.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/dog")
@RestController
public class DogController {

    @Autowired
    DogRepository dogRepository;

    @GetMapping("/new")
    public Optional<Dog> getNewDog() {
        Dog dog = new Dog("Rover");
        dogRepository.save(dog);
        return dogRepository.findById(1L);
    }

}
