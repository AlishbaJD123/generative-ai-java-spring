package com.gen.ai.ai.learn.spring.controller;

import com.gen.ai.ai.learn.spring.domain.ChatGenRequest;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GenAIChatController {

    private final ChatModel chatModel;

    public GenAIChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/chatgen")
    public String chatModelGen(@RequestBody ChatGenRequest chatGenRequest) {

        System.out.println("ChatModel - STARTED!!! - "+chatGenRequest.prompt());
        String response = chatModel.call(chatGenRequest.prompt());
        System.out.println("ChatModel - DONE!!! "+response);

        return response;
    }
}
