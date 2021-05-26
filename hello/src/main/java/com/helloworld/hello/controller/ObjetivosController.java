package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//A aplicação deverá conter um end-point que retorna 
//uma string com os seus objetivos de aprendizagem para essa semana.

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	@GetMapping
	public String objetivos() {
		return "Objetivos de aprendizagem para essa semana: aprender mais sobre API's e Protocolo HTTP, além de fazer mais exercícios de java";
	}
}
