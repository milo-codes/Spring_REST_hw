package com.codeclan.example.FileService.projections;

import com.codeclan.example.FileService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedAllUsers", types = User.class)
public interface EmbedAllUsers {

    String getName();
    List getFolders();

}
