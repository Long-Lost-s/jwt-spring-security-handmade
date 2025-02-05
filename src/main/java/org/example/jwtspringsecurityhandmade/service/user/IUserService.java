package org.example.jwtspringsecurityhandmade.service.user;

import org.example.jwtspringsecurityhandmade.model.User;
import org.example.jwtspringsecurityhandmade.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IGenericService<User> {
    UserDetails loadUserByUsername(String username);
    User findByUsername (String username);
}
