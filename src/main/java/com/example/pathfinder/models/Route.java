package com.example.pathfinder.models;

import com.example.pathfinder.models.enums.Level;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "routes")
@Getter
@Setter
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    @Enumerated(EnumType.STRING)
    private Level level;
    @Column
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    private User author;
    @Column(name = "video_url")
    private String videoUrl;
    @ManyToMany
    private Set<Category> categories;
}
