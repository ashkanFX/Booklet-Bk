package com.example.booklet.service.impl;

import com.example.booklet.model.Document;
import com.example.booklet.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl {

    private DocumentRepository documentRepository;

    @Autowired
    public void DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document registerDoc(Document document) {
        return this.documentRepository.save(document);
    }

    public List<Document> findAll() {
        return this.documentRepository.findAll();
    }
}
