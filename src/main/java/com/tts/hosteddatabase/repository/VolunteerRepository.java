package com.tts.hosteddatabase.repository;

import com.tts.hosteddatabase.model.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {
}
