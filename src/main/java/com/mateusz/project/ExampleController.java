package com.mateusz.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ExampleController {

    @GetMapping("/example")
    public String example(){
        return "my-template";
    }

}
