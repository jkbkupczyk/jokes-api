package com.kupczyk.jokesapi.api;

import com.kupczyk.jokesapi.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class JokesApiController {

    @Autowired
    private JokesApiService service;

    @GetMapping("")
    public Optional<Joke> randomJoke(){
        return service.randomJoke();
    }

    @GetMapping("jokes")
    public Collection<Joke> findAll(){
        return service.findAll();
    }

    @GetMapping("jokes/{id}")
    public Optional<Joke> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("jokes")
    public Iterable<Joke> findByType(@RequestParam String type){
        return service.findByType(type);
    }

    @GetMapping("jokes/info")
    public Map<String, Long> total(){
        return Collections.singletonMap("total", service.total());
    }

}