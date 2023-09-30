package com.example.pathfinder.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "messages")
@Getter
@Setter
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;
    @ManyToOne
    private User author;
    @ManyToOne
    private User recipient;
}
