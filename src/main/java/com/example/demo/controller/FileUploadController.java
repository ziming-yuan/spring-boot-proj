package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
    @PostMapping("/upload")
    public String uploadFile(String nickname, MultipartFile file, HttpServletRequest request) throws IOException{
        System.out.println("Nickname: " + nickname);
        System.out.println("File: " + file.getOriginalFilename());
        saveFile(file, request.getServletContext().getRealPath("/upload/"));
        return "File uploaded: " + file.getOriginalFilename();
    }
    public void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(path + photo.getOriginalFilename());
        photo.transferTo(file);
    }
}
