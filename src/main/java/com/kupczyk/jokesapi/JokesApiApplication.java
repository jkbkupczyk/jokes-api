package com.kupczyk.jokesapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kupczyk.jokesapi.api.JokesApiService;
import com.kupczyk.jokesapi.model.Joke;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@EnableSwagger2
public class JokesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesApiApplication.class, args);
	}


	@Bean
	CommandLineRunner runner(JokesApiService service){
		return args -> {

			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Joke>> typeReference = new TypeReference<List<Joke>>() {};
			InputStream input = typeReference.getClass().getResourceAsStream("/data/jokes.json");

			try {
				List<Joke> jokes = mapper.readValue(input, typeReference);
				service.save(jokes);
			}catch(IOException e){
				System.out.println(e);
			}
		};
	}

}