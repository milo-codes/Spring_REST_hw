package com.codeclan.example.FileService.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "title")
    private String title;

//    user id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

//    files list
    @OneToMany(mappedBy = "folder")
    private List<File> files;


}
