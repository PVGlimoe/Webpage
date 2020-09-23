package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {


    @GetMapping("/")
    public String welcome() {
        return "homepage";
    }

    @GetMapping("/action")
    public String action(){
        return "action";
    }

    @GetMapping("/comedy")
    public String comedy() {
        return "comedy";
    }

    @GetMapping("/hentai")
    public String hentai() {
        return "hentai";
    }

    @GetMapping("/horror")
    public String horror() {
        return "horror";
    }



}
