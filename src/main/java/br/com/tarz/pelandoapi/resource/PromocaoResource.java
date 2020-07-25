package br.com.tarz.pelandoapi.resource;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class PromocaoResource {

	private Long id;
	private String titulo;
	private String descricao;
	private BigDecimal preco;
	private String link;
	private Date dtInicio;
	private Date dtTermino;

}
