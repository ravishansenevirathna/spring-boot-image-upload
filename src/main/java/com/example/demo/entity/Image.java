package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 2:47 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageName;
    private String imageName2;


}
