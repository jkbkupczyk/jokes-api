package com.kupczyk.jokesapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Joke {
    private Long id;
    private String type;
    private String question;
    private String answer;
    private String lang;
    private User user;
}