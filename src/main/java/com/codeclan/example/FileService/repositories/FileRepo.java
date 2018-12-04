package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.projections.EmbedAllFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedAllFiles.class)
public interface FileRepo extends JpaRepository<File, Long> {
}
