package com.codeclan.example.FileService.projections;

import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllFolders", types = Folder.class)
public interface EmbedAllFolders {

    String getTitle();
    User getUser();
    List getFiles();

}
