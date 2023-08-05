package com.yakisan.demoapifeature.controller;

import com.yakisan.demoapifeature.exception.ResourceNotFoundException;
import com.yakisan.demoapifeature.entity.Game;
import com.yakisan.demoapifeature.service.GameService;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
@RestController
@Table(name = "game")
public class GameController {

    @Autowired
    GameService service;

    //Oyunlari geri dondurur.
    @GetMapping(value = "/games")
    public List<Game> getAllGames() {
        return service.getAllGames();
    }

    //Oyun ekler ve tum oyunlari geri dondurur.
    @PostMapping(value = "/add")
    public List<Game> addGame(@RequestBody final Game game) {
        service.addGame(game);
        return service.getAllGames();
    }

    //Oyunu siler.
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
        return id + " id'li oyun silindi.";
    }

    //Oyunu gunceller.
    @PutMapping("/update/{id}")
    public Game updateGame(@PathVariable int id,@RequestBody Game gameDetail) {
        Game updateGame = service.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id + " id'li oyun bulunamadı"));

        updateGame.setName(gameDetail.getName());
        updateGame.setDescription(gameDetail.getDescription());
        updateGame.setImageUrl(gameDetail.getImageUrl());
        updateGame.setGenre(gameDetail.getGenre());

        //oyunu veritabaninda guncelle
        service.updateGame(updateGame);
        return updateGame;
    }

}



