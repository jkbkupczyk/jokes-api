package com.kupczyk.jokesapi.api;

import com.kupczyk.jokesapi.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class JokesApiController {

    @Autowired
    private JokesApiService service;

    @GetMapping()
    public Collection<Joke> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Joke> findById(@PathVariable Long id){
        return service.findById(id);
    }
}