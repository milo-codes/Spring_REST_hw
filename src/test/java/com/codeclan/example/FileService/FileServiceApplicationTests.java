package com.codeclan.example.FileService;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.repositories.FileRepo;
import com.codeclan.example.FileService.repositories.FolderRepo;
import com.codeclan.example.FileService.repositories.UserRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileServiceApplicationTests {

	@Autowired
	FileRepo fileRepo;

	@Autowired
	FolderRepo folderRepo;

	@Autowired
	UserRepo userRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddFolderAndUser() {

		User user = new User("Alex");
		userRepo.save(user);

		Folder folder = new Folder("projects", user);
		folderRepo.save(folder);
		user.addFolder(folder);

	}

	@Test
	public void canAddFileAndFolder() {

		User user = new User("Alex");
		userRepo.save(user);

		Folder folder = new Folder("projects", user);
		folderRepo.save(folder);
		user.addFolder(folder);

		File file = new File("test_file", "txt", 55, folder);
		fileRepo.save(file);
		folder.addFile(file);

	}

}
