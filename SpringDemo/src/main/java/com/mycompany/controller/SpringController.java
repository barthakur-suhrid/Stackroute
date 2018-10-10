package com.mycompany.controller;

import com.mycompany.POJO.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userData(@ModelAttribute("user") User user){
        return "login";
    }

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String generateForm(ModelMap modelMap)
    {
        modelMap.addAttribute("user",new User());
        return "index";
    }

}
