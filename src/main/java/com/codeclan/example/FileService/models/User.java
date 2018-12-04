package com.codeclan.example.FileService.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    folders list
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;


    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }

    public User() {}


    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
