package com.example.pathfinder.models;

import com.example.pathfinder.models.enums.Level;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Integer age;
    @Column
    private String username;
    @Column
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Column
    private String email;
    @Column
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id")
    )
    private Set<Role> roles;
    @Enumerated(EnumType.STRING)
    private Level level;
}
