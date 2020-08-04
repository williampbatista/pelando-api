package br.com.tarz.pelandoapi.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.tarz.pelandoapi.resource.PromocaoResource;
import br.com.tarz.pelandoapi.responses.Response;
import br.com.tarz.pelandoapi.service.PromocaoService;

@RestController
@RequestMapping("/api/promocao")
public class PromocaoController {

	@Autowired
	PromocaoService service;

	@GetMapping
	public Object get() {
		Response<PromocaoResource> response = new Response<PromocaoResource>();
		response.setData(service.findAll());
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/{id}")
	public Object getById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public Object post(@RequestBody PromocaoResource resource, BindingResult result) {

		Response<PromocaoResource> response = new Response<PromocaoResource>();

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		
		response.getData().add(service.save(resource));

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(resource.getId()).toUri();

		return ResponseEntity.created(location).body(response);

	}
	
}
