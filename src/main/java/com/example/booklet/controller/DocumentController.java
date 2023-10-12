package com.example.booklet.controller;

import com.example.booklet.model.Document;
import com.example.booklet.service.impl.DocumentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/document")
public class DocumentController {
    private DocumentServiceImpl documentServiceImpl;

    @Autowired
    public void DocumentController(DocumentServiceImpl documentServiceImpl) {
        this.documentServiceImpl = documentServiceImpl;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private List<Document> findALl() {
        return this.documentServiceImpl.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private Document add(@RequestBody Document document) {
        return this.documentServiceImpl.registerDoc(document);
    }
}
