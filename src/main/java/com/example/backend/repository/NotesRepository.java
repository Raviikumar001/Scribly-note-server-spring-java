package com.example.backend.repository;
import com.example.backend.model.Notes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends MongoRepository<Notes, String> {
    List<Notes> findByCreator_Id(String creatorId);
}


