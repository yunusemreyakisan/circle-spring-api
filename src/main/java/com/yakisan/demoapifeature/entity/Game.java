package com.yakisan.demoapifeature.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
@Getter
@Setter
@Entity
public class Game extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "genre")
    private String genre;

    public Game() {
    }

    public Game(String name, String description, String imageUrl, String genre) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.genre = genre;
    }
}

