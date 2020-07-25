package br.com.tarz.pelandoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarz.pelandoapi.resource.PromocaoResource;
import br.com.tarz.pelandoapi.service.PromocaoService;

@RestController
@RequestMapping("/api/promocao")
public class PromocaoController {

	@Autowired
	PromocaoService service;

	@GetMapping
	public Object get() {
		return ResponseEntity.ok(service.findAll());
	}

	@PostMapping
	public Object post(@RequestBody PromocaoResource resource) {
		resource = service.save(resource);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
