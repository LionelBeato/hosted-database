package com.tts.hosteddatabase.controller;

import com.tts.hosteddatabase.model.Volunteer;
import com.tts.hosteddatabase.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteerController {

    @Autowired
    VolunteerRepository volunteerRepository;

    @GetMapping("/")
    public String getIndex() {
        return "Hello Heroku!";
    }

    @GetMapping("/all")
    public Iterable<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

}
