package com.ecommerce.demo.models.user;

import com.ecommerce.demo.models.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.MERGE
    })
    @JoinTable(
            name = "user_role",
            joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;

    public void addRole(Role role){
        if(roles == null){
            roles = new ArrayList<>();
        }
        roles.add(role);
    }

}
