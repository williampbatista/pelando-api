package br.com.tarz.pelandoapi.converter;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tarz.pelandoapi.entity.Promocao;
import br.com.tarz.pelandoapi.resource.PromocaoResource;

public class PromocaoConverter {

	public static Promocao toEntity(final PromocaoResource resource) {
		Promocao entity = new Promocao();

		entity.setId(resource.getId());
		entity.setTitulo(resource.getTitulo());
		entity.setDescricao(resource.getDescricao());
		entity.setPreco(resource.getPreco());
		entity.setLink(resource.getLink());
		entity.setDtInicio(resource.getDtInicio());
		entity.setDtTermino(resource.getDtTermino());
		entity.setTemperatura(resource.getTemperatura());
		entity.setCupom(resource.getCupom());
		entity.setImage(resource.getImage());

		return entity;
	}

	public static PromocaoResource toResource(final Promocao entity) {
		PromocaoResource resource = new PromocaoResource();

		resource.setId(entity.getId());
		resource.setTitulo(entity.getTitulo());
		resource.setDescricao(entity.getDescricao());
		resource.setPreco(entity.getPreco());
		resource.setLink(entity.getLink());
		resource.setDtInicio(entity.getDtInicio());
		resource.setDtTermino(entity.getDtTermino());
		resource.setTemperatura(entity.getTemperatura());
		resource.setCupom(entity.getCupom());
		resource.setImage(entity.getImage());

		return resource;
	}
	
	public static List<PromocaoResource> toListResource(final List<Promocao> entities) {
		return entities.stream().map(s -> toResource(s)).collect(Collectors.toList());
	}

}
