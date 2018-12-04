package com.codeclan.example.FileService.components;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.repositories.FileRepo;
import com.codeclan.example.FileService.repositories.FolderRepo;
import com.codeclan.example.FileService.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepo fileRepo;

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    UserRepo userRepo;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        User alex = new User("Alex");
        userRepo.save(alex);

        User chris = new User("Chris");
        userRepo.save(chris);


        Folder projects = new Folder("projects", alex);
        folderRepo.save(projects);
        alex.addFolder(projects);

        Folder invoices = new Folder("invoices", chris);
        folderRepo.save(invoices);
        chris.addFolder(invoices);


        File testFile = new File("test_file", "txt", 55, projects);
        fileRepo.save(testFile);
        projects.addFile(testFile);

        File readMe = new File("read_me_file", "md", 27, invoices);
        fileRepo.save(readMe);
        invoices.addFile(readMe);

    }

}
