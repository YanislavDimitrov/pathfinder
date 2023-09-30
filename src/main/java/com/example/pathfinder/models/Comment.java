package com.example.pathfinder.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "comments")
@Getter
@Setter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private boolean approved;
    @Column
    private LocalDateTime created;
    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;
    @ManyToOne
    private User author;
    @ManyToOne
    private Route route;
}
