package org.example.jwtspringsecurityhandmade.service.role;

import org.example.jwtspringsecurityhandmade.model.Role;
import org.example.jwtspringsecurityhandmade.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private IRoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role findById(Long id) {
        return null;
    }

    public Role save(Role role) {
        return null;
    }

    @Override
    public void delete(Role role) {

    }
}
