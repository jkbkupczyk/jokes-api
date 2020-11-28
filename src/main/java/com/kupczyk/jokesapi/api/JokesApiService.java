package com.kupczyk.jokesapi.api;

import com.kupczyk.jokesapi.model.Joke;
import com.kupczyk.jokesapi.repository.JokesApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class JokesApiService {

    @Autowired
    private JokesApiRepository repository;

    public Collection<Joke> findAll(){
        return repository.findAll();
    }

    public Optional<Joke> findById(Long id) {
        return repository.findById(id);
    }
}