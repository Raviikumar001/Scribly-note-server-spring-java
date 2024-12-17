package com.example.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.time.LocalDateTime;

@Data
@Document(collection = "notes")
public class Notes {
    @Id
    private String id;

    @DBRef
    private User creator;

    private String title;

    private String body;

    private LocalDateTime lastModified = LocalDateTime.now();

    private LocalDateTime dateCreated = LocalDateTime.now();
}