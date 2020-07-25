package br.com.tarz.pelandoapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarz.pelandoapi.converter.PromocaoConverter;
import br.com.tarz.pelandoapi.repository.PromocaoRepository;
import br.com.tarz.pelandoapi.resource.PromocaoResource;

@Service
public class PromocaoService {

	@Autowired
	PromocaoRepository repository;

	public List<PromocaoResource> findAll() {

		return PromocaoConverter.toListDto(repository.findAll());
	}

	public PromocaoResource save(PromocaoResource resource) {
		return PromocaoConverter.toResource(repository.save(PromocaoConverter.toEntity(resource)));
	}

}
