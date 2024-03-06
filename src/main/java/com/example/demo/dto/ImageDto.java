package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 2:47 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ImageDto {
    private Long id;
    private MultipartFile imageName;
    private MultipartFile imageName2;

}
