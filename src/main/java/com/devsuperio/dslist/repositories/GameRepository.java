package com.devsuperio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.dslist.entities.Game;

//responsável para fazer consultas no banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {

}
