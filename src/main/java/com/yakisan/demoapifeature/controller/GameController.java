package com.yakisan.demoapifeature.controller;

import com.yakisan.demoapifeature.exception.ResourceNotFoundException;
import com.yakisan.demoapifeature.model.Game;
import com.yakisan.demoapifeature.repository.GameRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
@RestController
@Table(name = "game")
public class GameController {
    @Autowired
    GameRepository repository;

    //Oyunlari geri dondurur.
    @GetMapping(value = "/games")
    public List<Game> getAllGames() {
        return repository.findAll();
    }

    //Oyun ekler ve tum oyunlari geri dondurur.
    @PostMapping(value = "/games/add")
    public List<Game> addGame(@RequestBody final Game game) {
        repository.save(game);
        return repository.findAll();
    }

    //Oyunu siler.
    @DeleteMapping("/games/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        repository.deleteById(id);
        return id + " id'li oyun silindi.";
    }

    //Oyunu gunceller.
    @PutMapping("/games/update/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable int id,@RequestBody Game gameDetail) {
        Game updateGame = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id + " id'li oyun bulunamadı"));

        updateGame.setName(gameDetail.getName());
        updateGame.setDescription(gameDetail.getDescription());
        updateGame.setImageUrl(gameDetail.getImageUrl());
        updateGame.setGenre(gameDetail.getGenre());

        //oyunu veritabaninda guncelle
        repository.save(updateGame);

        return ResponseEntity.ok(updateGame);
    }

}



