package com.example.pathfinder.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "pictures")
@Getter
@Setter
@NoArgsConstructor
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column(columnDefinition = "TEXT")
    private String url;
    @ManyToOne
    private User author;
    @ManyToOne
    private Route route;
}

