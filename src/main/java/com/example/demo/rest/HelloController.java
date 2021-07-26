package com.example.demo.rest;

//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller // Spring MVC con redireccion a plantillas HTML dentro del proyecto 
//@Component // Anotacion generica para clases que no recaen en ninguna capa

@RequestMapping("") // Enrutado HTTP
@RestController
public class HelloController {

	private final Logger log = LoggerFactory.getLogger(HelloController.class);

	/*
	 * http://localhost:8080/api/hello
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "API REST is at /api/...";
	}

	@GetMapping("/api/hello")
	public String hello() {

		log.info("Executing hello world method");
//		log.warn("Executing hello world method");
//		log.error("Executing hello world method");
		return "Hola Mundo";

	}

	/**
	 * http://localhost:8080/api/hello
	 * 
	 * @return
	 */
	@GetMapping("/api/bye")
	public String bye() {
		log.info("Executing bye world method from logger");
		// diferentes niveles de logger:
		// log.warn("Executing hello world method from logger");
		// log.error("Executing hello world method from logger");
		return "Adios mundo cruel";
	}

}
