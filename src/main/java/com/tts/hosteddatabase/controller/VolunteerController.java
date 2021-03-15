package com.tts.hosteddatabase.controller;

import com.tts.hosteddatabase.model.Volunteer;
import com.tts.hosteddatabase.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class VolunteerController {

    @Autowired
    VolunteerRepository volunteerRepository;

    @GetMapping("/")
    public String getIndex() {
        return "Hello Heroku v13!";
    }

    @GetMapping("/all")
    public Iterable<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @GetMapping("/new")
    public Optional<Volunteer> getNewVolunteer() {
        Volunteer volunteer = new Volunteer("password", "jimmy", "neutron", "jimbo");
        volunteerRepository.save(volunteer);
        return volunteerRepository.findByUsername("jimbo");
    }

}
