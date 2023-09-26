package com.in28minutes.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
//    @Column(name="name")
    private String name;
    // @Column(name="author") not mandatory because author is the Bean name is same with the table
    private String author;

    public Course(){

    }

    //Constructor
    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }
    //Getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //toString
    @Override
    public String toString() {
        return "Course[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ']';
    }
}
