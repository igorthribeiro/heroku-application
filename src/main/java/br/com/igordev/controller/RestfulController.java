package br.com.igordev.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*") // habilitado no controller
@RestController
public class RestfulController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
