package com.yakisan.demoapifeature.repository;

import com.yakisan.demoapifeature.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
