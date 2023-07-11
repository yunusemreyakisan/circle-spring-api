package com.yakisan.demoapifeature.service;

import com.yakisan.demoapifeature.model.Game;
import com.yakisan.demoapifeature.repository.GameRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    //Repository variable
    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    //Oyunlari geri dondurur.
    public List<Game> getAllGames() {
        return repository.findAll();
    }

    //Oyun ekler ve tum oyunlari geri dondurur.
    public void addGame(Game game) {
        repository.save(game);
        ResponseEntity.ok();
    }

    //findById method
    public Optional<Game> findById(Integer id) {
        return repository.findById(id);
    }


    //Oyunu siler.
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    //Oyunu gunceller.
    public void updateGame(Game game) {
        //oyunu veritabaninda guncelle
        repository.save(game);
        ResponseEntity.ok(game);
    }

}

