package com.example.demo.controllers;

import com.example.demo.entities.Dog;
import com.example.demo.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    private DogService dogService;

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public List<Dog> getDogsAll(){
        return dogService.getAllDogs();
    }

    @RequestMapping(method = RequestMethod.GET,path = "/{name}")
    public Dog getDog(@PathVariable(value="name") String name){
        return dogService.getDog(name);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/")
    public Dog addDog(@RequestBody Dog dog){
        return dogService.addDog(dog);
    }

}
