package com.doljak.crudspring.controllers;

import com.doljak.crudspring.models.Course;
import com.doljak.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;
    @GetMapping
    public List<Course> getList(){
        return this.courseRepository.findAll();
    }
}
