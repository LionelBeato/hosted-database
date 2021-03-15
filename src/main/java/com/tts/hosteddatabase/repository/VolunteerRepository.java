package com.tts.hosteddatabase.repository;

import com.tts.hosteddatabase.model.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
    Optional<Volunteer> findByUsername(String username);
}
