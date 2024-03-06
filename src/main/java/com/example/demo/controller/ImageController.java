package com.example.demo.controller;

import com.example.demo.dto.ImageDetailsGetDto;
import com.example.demo.dto.ImageDto;
import com.example.demo.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 2:47 PM
 */
@RestController
@RequestMapping("/image_upload")
@CrossOrigin

public class ImageController {
    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping
    public ResponseEntity<Object> saveImage(@ModelAttribute ImageDto imageDto) throws URISyntaxException, IOException {
        ImageDetailsGetDto dto = imageService.saveImage(imageDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @GetMapping("/getall")
    public ResponseEntity<Object> getAllImage(){
            List<ImageDetailsGetDto> dto = imageService.getAllImage();
            return new ResponseEntity<>(dto, HttpStatus.OK);

    }


}
