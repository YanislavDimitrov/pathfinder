package com.example.pathfinder.models;

import com.example.pathfinder.models.enums.CategoryType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private CategoryType name;
    @Column(columnDefinition = "TEXT")
    private String description;
}
