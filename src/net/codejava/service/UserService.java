package net.codejava.service;

import net.codejava.models.User;
import net.codejava.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
    public User checkUserValidity(String username,String password){
        User user=userRepository.getUserByUsernameAndPassword(username,password);
        if(user==null)
            return null;
        else
            return user;
    }
}
