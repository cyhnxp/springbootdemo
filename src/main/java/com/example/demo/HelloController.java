package com.example.demo;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class HelloController {


    @RequestMapping("/users")
    public String users(Model map){

        String str="HHHHHH";

        map.addAttribute("user",str);
        return "admin/test";
    }

    @RequestMapping("/u")
    public ModelAndView u(Map<String,Object> map){

        map.put("u","ffffffff");


        return new ModelAndView("admin/u",map);

    }



}
