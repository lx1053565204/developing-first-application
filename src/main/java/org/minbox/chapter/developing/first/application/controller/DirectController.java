package org.minbox.chapter.developing.first.application.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectController {

    @GetMapping("/send")
    public String send()
    {
      return "SUCCESS";
    }

}
