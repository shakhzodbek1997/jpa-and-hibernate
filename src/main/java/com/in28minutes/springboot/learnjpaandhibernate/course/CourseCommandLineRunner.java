package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, " LEARN AWS JPA!", "in28minutes"));
        repository.insert(new Course(2, " LEARN Azure JPA!", "in28minutes"));
        repository.insert(new Course(3, " LEARN Docker Now!", "in28minutes"));
        repository.insert(new Course(4, " LEARN React Now!", "in28minutes"));
        repository.insert(new Course(5, " LEARN Java Now!", "in28minutes"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }




}
