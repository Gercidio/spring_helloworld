package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World e muito bom dia turma 68!!!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<ul>"
				+ "<li>Persistência</li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Proatividade</li>"
				+ "<li>Comunicação</li>"
				+ "<li>Orientação ao Detalhe</li>"
				+ "</ul>";
	}
	
	@GetMapping("/listaObj")
	public String ListaObjetivos() {
		return "<ul>"
				+ "<li>Criar plano de revisão dos assuntos vistos até então</li>"
				+ "<li>Entender o SpringBoot e recuperar a matéria que perdi ontem</li>"
				+ "<li>Melhorar minha orientação ao detalhe</li>"
				+ "</ul>";
	}
}
