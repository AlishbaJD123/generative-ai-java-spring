package com.gen.ai.ai.learn.spring.controller;

import com.gen.ai.ai.learn.spring.domain.ImageGenRequest;
import org.springframework.ai.image.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GenAIImageModelController {

    private final ImageModel imageModel;

    public GenAIImageModelController(ImageModel imageModel) {
        this.imageModel = imageModel;
    }

    @GetMapping("/imagegen")
    public String imageGen(@RequestBody ImageGenRequest imageGenRequest) {

        ImageOptions options = ImageOptionsBuilder.builder()
                .withModel("dall-e-3")
                .withWidth(1024)
                .withHeight(1024)
                .build();
        ImagePrompt imagePrompt = new ImagePrompt(imageGenRequest.prompt(), options);

        System.out.println("ImageModel - STARTED!!! - " + imageGenRequest.prompt());
        ImageResponse response = imageModel.call(imagePrompt);
        System.out.println("ImageModel - DONE!!! " + response);

        return "redirect:" + response.getResult().getOutput().getUrl();
    }
}