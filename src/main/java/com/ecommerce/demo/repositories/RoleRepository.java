package com.ecommerce.demo.repositories;

import com.ecommerce.demo.models.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String name);
}
