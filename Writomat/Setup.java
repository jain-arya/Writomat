package com.example.socialmediaanalytics.config;

import com.example.socialmediaanalytics.model.User;
import com.example.socialmediaanalytics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("John Doe", "Influencer", "Bio of John", "contact@johndoe.com", "http://johndoe.com"));
        userRepository.save(new User("Jane Smith", "Blogger", "Bio of Jane", "contact@janesmith.com", "http://janesmith.com"));
    }
}
