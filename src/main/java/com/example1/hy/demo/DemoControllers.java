package com.example1.hy.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoControllers {

    @ResponseBody
    @RequestMapping(value="/index.html", method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }

    @RequestMapping(value="/home.html", method = RequestMethod.GET)
    public String home(){
        return "home.html";
    }
}
