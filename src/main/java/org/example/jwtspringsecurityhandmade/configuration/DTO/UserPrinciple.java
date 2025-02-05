package org.example.jwtspringsecurityhandmade.configuration.DTO;

import org.example.jwtspringsecurityhandmade.model.Role;
import org.example.jwtspringsecurityhandmade.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserPrinciple implements UserDetails {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String username;
    private final String password;
    private final Collection<? extends GrantedAuthority> authorities;

    public UserPrinciple(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserPrinciple build(User user) {
        List<GrantedAuthority> author = new ArrayList<>();
        for (Role role : user.getRoles()) {
            author.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new UserPrinciple(user.getUsername(), user.getPassword(), author);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
