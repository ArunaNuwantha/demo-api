package com.example.demoapi.services;

import com.example.demoapi.entities.DemoUserDetails;
import com.example.demoapi.entities.User;
import com.example.demoapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("user not found");

        return new DemoUserDetails(user);
    }
}
