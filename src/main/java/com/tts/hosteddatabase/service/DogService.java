package com.tts.hosteddatabase.service;

import com.tts.hosteddatabase.model.Dog;
import com.tts.hosteddatabase.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {

    @Autowired
    DogRepository dogRepository;

    public Number getDogAverage() {
        List<Integer> dogList = new ArrayList<>();

        dogRepository.findAll()
                .forEach((dog) -> {
                   dogList.add(dog.getDogRating());
                });

       Integer resultFromReduce = dogList
               .stream()
               .reduce((a, b) -> a + b)
               .orElseThrow();

       Integer result = resultFromReduce / dogList.size();
       return result;
    }

}
