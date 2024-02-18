package com.doljak.crudspring;

import com.doljak.crudspring.models.Course;
import com.doljak.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course a = new Course();
			a.setName("Angular com Spring");
			a.setCategory("front-end");

			Course b = new Course();
			b.setName("Java");
			b.setCategory("back-end");

			Course c = new Course();
			c.setName("SQL");
			c.setCategory("database");

			courseRepository.save(a);
			courseRepository.save(b);
			courseRepository.save(c);
		};
	}

}
