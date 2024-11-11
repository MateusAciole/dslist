package com.devmatt.dslist.repositories;

import com.devmatt.dslist.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
