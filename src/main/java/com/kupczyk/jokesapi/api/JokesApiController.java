package com.kupczyk.jokesapi.api;

import com.kupczyk.jokesapi.model.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api")
public class JokesApiController {

    @Autowired
    private JokesApiService service;

    @GetMapping("")
    public Optional<Joke> randomJoke(){
        return service.getRandomJoke();
    }

    @GetMapping("jokes")
    public Iterable<Joke> findJoke(@RequestParam(required = false) List<String> type, @RequestParam(required = false) List<String> lang){

        if (type == null && lang == null){
            return service.findAll();
        }
        else if (type == null){
            return service.findByLang(lang);
        }

        return service.findByType(type);
    }

    @GetMapping("jokes/{id}")
    public Optional<Joke> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("jokes/info")
    public Map<String, Long> total(){
        return Collections.singletonMap("totalJokes", service.totalJokes());
    }
}