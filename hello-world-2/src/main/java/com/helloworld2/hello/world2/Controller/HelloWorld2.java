package com.helloworld2.hello.world2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld2")

public class HelloWorld2 {
	
	@GetMapping 
	public String helloworld2() {
		return "Quero aprender o spring-boot para entender como funciona essa ligação então back,front,DB "
				+ "para criar uma lógica de desenvolvimento de um projeto por completo e implementar no meu projeto.";
	}

}
