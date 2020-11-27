package com.kupczyk.jokesapi.repository;

import com.kupczyk.jokesapi.model.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokesApiRepository extends JpaRepository<Joke, Long> {
}