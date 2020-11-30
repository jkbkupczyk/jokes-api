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
    public Collection<Joke> findAll(){
        Joke j1 = new Joke();

        j1.setType("test");
        j1.setQuestion("test");
        j1.setAnswer("test");
        j1.setLang("test");

        service.save(j1);

        return service.findAll();
    }

    @GetMapping("jokes/{id}")
    public Optional<Joke> findById(@PathVariable Long id){
        return service.findById(id);
    }

    public Iterable<Joke> findByType(@RequestParam String type){
        return service.findByType(type);
    }

    @GetMapping("jokes")
    public Map<String, Long> total(){
        return Collections.singletonMap("total", service.total());
    }
}