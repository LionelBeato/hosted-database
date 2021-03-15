package com.tts.hosteddatabase.repository;

import com.tts.hosteddatabase.model.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
}
