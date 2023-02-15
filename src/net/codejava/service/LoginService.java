package net.codejava.service;

import net.codejava.models.User;
import org.springframework.stereotype.Service;

public class LoginService {
    public static boolean isLogged=false;
    public static User user;

    public static void setLogged(User user){
        LoginService.isLogged=true;
        LoginService.user=user;
    }
    public static void setLoggedOut(){
        LoginService.isLogged=false;
        LoginService.user=null;
    }

    public static boolean isIsLogged() {
        return isLogged;
    }
}
