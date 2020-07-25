package br.com.tarz.pelandoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.tarz.pelandoapi.entity.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Integer>, JpaSpecificationExecutor<Promocao>{

}
