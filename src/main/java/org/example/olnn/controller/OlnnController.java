package org.example.olnn.controller;

import org.example.olnn.services.FileService;
import org.springframework.stereotype.Controller;

@Controller
public class OlnnController {
    private final FileService fileService;

    public OlnnController(FileService fileService) {
        this.fileService = fileService;
        fileService.readFile();
    }

    public FileService getFileService() {
        return fileService;
    }
}
