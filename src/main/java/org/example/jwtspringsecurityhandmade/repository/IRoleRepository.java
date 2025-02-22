package org.example.jwtspringsecurityhandmade.repository;

import org.example.jwtspringsecurityhandmade.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
