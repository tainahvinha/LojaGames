package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//A aplicação deverá conter um end-point que retorna
//uma string com as habilidades e mentalidades que você
//utilizou para realizar essa atividade.


@RestController
@RequestMapping ("/habilidades")

public class HabilidadeController {
	
	@GetMapping
	public String hello () {
		return "Habilidades e mentalidades utilizadas:\n 1. Persistência,\n 2. Atenção aos detalhes";
	
	}
}
