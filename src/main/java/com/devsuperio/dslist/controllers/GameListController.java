package com.devsuperio.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperio.dslist.dto.GameListDTO;
import com.devsuperio.dslist.services.GameListService;

//porta da entrada é a interface pela eaa api que chama para mundo externo

@RestController
@RequestMapping(value = "/lists")//caminho para responder na api utililzar no postman http://localhost:8080/games

public class GameListController {

	@Autowired
private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	

}
