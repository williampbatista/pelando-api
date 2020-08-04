package br.com.tarz.pelandoapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarz.pelandoapi.converter.PromocaoConverter;
import br.com.tarz.pelandoapi.entity.Promocao;
import br.com.tarz.pelandoapi.repository.PromocaoRepository;
import br.com.tarz.pelandoapi.resource.PromocaoResource;

@Service
public class PromocaoService {

	@Autowired
	PromocaoRepository repository;

	public List<PromocaoResource> findAll() {
		return PromocaoConverter.toListResource(repository.findAll());
	}

	public PromocaoResource findById(Long id) {

		Optional<Promocao> promocao = repository.findById(id);

		if (promocao.isPresent())
			return PromocaoConverter.toResource(promocao.get());

		return null;
	}

	public PromocaoResource save(PromocaoResource resource) {
		return PromocaoConverter.toResource(repository.save(PromocaoConverter.toEntity(resource)));
	}

}
