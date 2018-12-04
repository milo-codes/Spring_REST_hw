package com.codeclan.example.FileService.projections;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedAllFiles", types = File.class)
public interface EmbedAllFiles {

    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();

}
