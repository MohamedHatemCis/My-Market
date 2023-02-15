package net.codejava.controllers;


import net.codejava.models.User;
import net.codejava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private UserService service;

    @RequestMapping(name = "",method = RequestMethod.GET)
    public String registerPage(){
        return "register";
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public String saveToDB(@ModelAttribute("user") User user){
        System.out.println("user = " + user);
        service.saveUser(new User(user.getId(),user.getUsername(),user.getPassword()));
        return "startpage";
    }
}
