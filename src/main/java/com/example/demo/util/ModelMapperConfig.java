package com.example.demo.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 2:48 PM
 */
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
