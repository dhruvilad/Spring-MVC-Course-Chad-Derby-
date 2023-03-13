package com.chad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){

        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        System.out.println("hello..");
        return "helloworld";
    }

    @RequestMapping("processFormVersion2")
    public String letsShoutDude(HttpServletRequest request, Model model){

        String stuName = (String) request.getParameter("studentName");

        stuName="yo!!!!!!!     "+stuName.toUpperCase();
        System.out.println(stuName);
        model.addAttribute("message",stuName);
        return "helloworld";
    }
}
