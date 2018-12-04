package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.projections.EmbedAllFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedAllFolders.class)
public interface FolderRepo extends JpaRepository<Folder, Long> {
}
