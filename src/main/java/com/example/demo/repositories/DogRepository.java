package com.example.demo.repositories;

import com.example.demo.entities.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
    Dog findByName(String name);
}
