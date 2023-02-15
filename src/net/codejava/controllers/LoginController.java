package net.codejava.controllers;

import net.codejava.models.User;
import net.codejava.service.LoginService;
import net.codejava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService service;

    @GetMapping(name = "")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String checkValidUser(@ModelAttribute("user") User user){
        User returnedUser=service.checkUserValidity(user.getUsername(),user.getPassword());
        if (returnedUser!=null) {
            LoginService.setLogged(returnedUser);
            return "startpage";
        }
        else
            return "login";
    }
}
