package com.example1.hy.demo;

import java.net.ContentHandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class DemoControllers {

//    @ResponseBody
   // @RequestMapping(value="/index.html", method = RequestMethod.GET)
    @GetMapping("/index.html")
    public String index(){
        return "index.html";
    }

 //   @RequestMapping(value="/home.html", method = RequestMethod.GET)
    @GetMapping("/home.html")
    public String home(){
        return "home";
    }

    @GetMapping("/printName")
	public String RtnCompany(@RequestParam( value = "myName" , defaultValue = "Nothing" ) String name){
        Company c1 = new Company(name);
        return c1.getName();
    }

  //  @RequestMapping(value="/printName", method = RequestMethod.GET)
  //  public String RtnCompany(@RequestParam("myName") String name){
  //      Company c1 = new Company(name);
  //      return c1.getName();
 //   }
}
