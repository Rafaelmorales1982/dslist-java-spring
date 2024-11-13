package com.devsuperio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperio.dslist.dto.GameMinDTO;
import com.devsuperio.dslist.entities.Game;
import com.devsuperio.dslist.repositories.GameRepository;

//registrando como componente do sistema
@Service
public class GameService {
 //injetando gameRepository dentro do GameService
	@Autowired
	private GameRepository gameRepository;
	
	//lista do MinDTA resumo que quero que apareça
	public List<GameMinDTO> findAll(){//retorna uma lista da classe GameMinDTO
		//pesquisando no banco uma lista de games
		List<Game> result = gameRepository.findAll();
		
		//transformando lista Game para GameMinDTO
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
}
