package com.kupczyk.jokesapi.api;

import com.kupczyk.jokesapi.model.Joke;
import com.kupczyk.jokesapi.repository.JokesApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JokesApiService {

    @Autowired
    private JokesApiRepository repository;

    public List<Joke> findAll(){
        return repository.findAll();
    }

    public Optional<Joke> findById(Long id) {
        return repository.findById(id);
    }

    public Iterable<Joke> findByType(String type) {
        return repository.findByType(type);
    }

    public Joke save(Joke joke){
        return repository.save(joke);
    }

    public Iterable<Joke> save(Iterable<Joke> jokes){
        return repository.saveAll(jokes);
    }

    public Long total(){
        return repository.count();
    }
}