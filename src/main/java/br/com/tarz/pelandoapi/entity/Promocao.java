package br.com.tarz.pelandoapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promocao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2212266494755505824L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROMOCAO_GEN")
	@SequenceGenerator(name = "PROMOCAO_GEN", sequenceName = "PROMOCAO_SEQ", allocationSize = 1)
	private Long id;
	private String titulo;
	private String descricao;
	private BigDecimal preco;
	private String link;
	private Date dtInicio;
	private Date dtTermino;
	private Integer temperatura;
	private String cupom;
	private String image;

}
