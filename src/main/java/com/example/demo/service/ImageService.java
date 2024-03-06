package com.example.demo.service;

import com.example.demo.dto.ImageDetailsGetDto;
import com.example.demo.dto.ImageDto;
import com.example.demo.entity.Image;
import com.example.demo.repo.ImageRepo;
import com.example.demo.util.ModelMapperConfig;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : demo
 * Created date : 3/5/2024
 * Created time : 2:47 PM
 */
@Service
public class ImageService {

    private final ImageRepo imageRepo;

    private final ModelMapperConfig modelMapperConfig;

    public ImageService(ImageRepo imageRepo, ModelMapperConfig modelMapperConfig) {
        this.imageRepo = imageRepo;
        this.modelMapperConfig = modelMapperConfig;
    }

    public ImageDetailsGetDto saveImage(ImageDto imageDto) throws IOException, URISyntaxException {
        String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
        File uploadDir = new File(projectPath + "/uploads");
//        meke hari nam project path eka denna one /src/main/resources/static menna me path erke
        uploadDir.mkdir();

        imageDto.getImageName().transferTo(new File(uploadDir.getAbsolutePath() + "/" + imageDto.getImageName().getOriginalFilename()));
        imageDto.getImageName2().transferTo(new File(uploadDir.getAbsolutePath() + "/" + imageDto.getImageName2().getOriginalFilename()));

        Image image = dtoToEntity(imageDto);
        image.setImageName("uploads/" + imageDto.getImageName().getOriginalFilename());
        image.setImageName2("uploads/" + imageDto.getImageName2().getOriginalFilename());


        Image save = imageRepo.save(image);
        return entityToDto(save);

    }



    public List<ImageDetailsGetDto> getAllImage(){
        List<Image> all = imageRepo.findAll();
        List<ImageDetailsGetDto> list = new ArrayList<>();
        for (Image image : all) {
            ImageDetailsGetDto dto = entityToDto(image);
            list.add(dto);
        }
        return list;
    }

    private Image dtoToEntity(ImageDto dto){
       return modelMapperConfig.modelMapper().map(dto, Image.class);
    }

    private ImageDetailsGetDto entityToDto(Image image){
        return modelMapperConfig.modelMapper().map(image,ImageDetailsGetDto.class);
    }

}
