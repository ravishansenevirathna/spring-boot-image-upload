package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 3:19 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ImageDetailsGetDto {
    private Long id;
    private String imageName;
    private String imageName2;
}
