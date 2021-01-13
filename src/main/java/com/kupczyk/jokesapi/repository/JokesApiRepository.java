package com.kupczyk.jokesapi.repository;

import com.kupczyk.jokesapi.model.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JokesApiRepository extends JpaRepository<Joke, Long> {

    Iterable<Joke> findByTypeIn(List<String> types);
    Iterable<Joke> findByLangIn(List<String> lang);
}