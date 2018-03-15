package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class WelcomeController{

    private String _greeting = null;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message){
        _greeting = message;
    }


    @GetMapping("/")
    public String sayHello(){
        return _greeting;
    }
}
//sample edit
//sample edit
//sample edit
