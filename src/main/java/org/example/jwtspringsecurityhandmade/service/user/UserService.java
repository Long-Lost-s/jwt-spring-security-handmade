package org.example.jwtspringsecurityhandmade.service.user;

import org.example.jwtspringsecurityhandmade.configuration.DTO.UserPrinciple;
import org.example.jwtspringsecurityhandmade.model.User;
import org.example.jwtspringsecurityhandmade.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

@Service
public class UserService implements IUserService, UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    public List<User> findAll() {
        return List.of();
    }

    public User findById(Long id) {
        return null;
    }

    public User save(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        return UserPrinciple.build(user);
    }
}
