package com.tts.hosteddatabase.service;

import com.tts.hosteddatabase.repository.VolunteerRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
//public class VolunteerService implements UserDetailsService {
//
//    private VolunteerRepository volunteerRepository;
//
//    public VolunteerService(VolunteerRepository volunteerRepository) {
//        this.volunteerRepository = volunteerRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return null;
//    }
//}
