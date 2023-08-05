package com.yakisan.demoapifeature.repository;

import com.yakisan.demoapifeature.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
public interface GameRepository extends JpaRepository<Game, Integer> {
}
