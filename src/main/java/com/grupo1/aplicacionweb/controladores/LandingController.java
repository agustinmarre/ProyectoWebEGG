package com.grupo1.aplicacionweb.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"","/"})
public class LandingController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
