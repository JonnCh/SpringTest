package com.example.demo.services;

import com.example.demo.entities.Dog;
import com.example.demo.repositories.DogRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return Lists.newArrayList(dogRepository.findAll());
    }

    public Dog getDog(String name) {
        return dogRepository.findByName(name);
    }

    public Dog addDog(Dog dog) {
        return dogRepository.save(dog);
    }
}
