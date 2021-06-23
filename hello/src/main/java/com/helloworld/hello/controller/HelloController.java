package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "hello Generation"+
	"\nFoi necessário para essa atividade mentalidade de persistência,"
	+ " no fato de se desempenhar e analisar a forma que funciona o spring junto com a atenção aos detalhes.\r\n";
	}

}
