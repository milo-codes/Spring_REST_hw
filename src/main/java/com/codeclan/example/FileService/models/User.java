package com.codeclan.example.FileService.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    folders list

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
