package com.mateusz.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
class ExampleController {

    @GetMapping("/example")
    public String example(){
        return "my-template";
    }

    @GetMapping("/example2")
    public String example2(Model model){
        model.addAttribute("myStringAttribute", "Jakiś teks");
        model.addAttribute("myListAttribute", List.of("pierwszy", "drugi", "trzeci"));
    return "model-attribute-example";
    }

}
