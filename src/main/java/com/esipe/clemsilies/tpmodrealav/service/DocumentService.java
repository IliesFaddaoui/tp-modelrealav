package com.esipe.clemsilies.tpmodrealav.service;

import com.esipe.clemsilies.tpmodrealav.Repository.DocumentRepository;
import com.esipe.clemsilies.tpmodrealav.model.Document;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public Document getDocuments(String documentId) throws NotFoundException {
        Document document = documentRepository.findOne(documentId);
        return document;
    }

    public Document createDocument(Document document){
        Document newDoc = documentRepository.insert(document);
        return newDoc;
    }

    public Document updateDocument(Document updatedDocument){
        Document document = documentRepository.findOne(updatedDocument.getDocumentId());
        document.setTitle(updatedDocument.getTitle());
        document.setBody(updatedDocument.getTitle());
        document.setCreated(updatedDocument.getCreated());
        document.setUpdated(updatedDocument.getUpdated());
        document.setCreator(updatedDocument.getCreator());
        document.setEditor(updatedDocument.getEditor());

        return documentRepository.save(document);
    }

}
