package com.esipe.clemsilies.tpmodrealav.Repository;


import com.esipe.clemsilies.tpmodrealav.model.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DocumentRepository extends MongoRepository<Document, String>{
    @Query("{ 'document.documentId' : ?0}")
    Page<Document> findByDocumentId(String documentId, Pageable pageable);
}
