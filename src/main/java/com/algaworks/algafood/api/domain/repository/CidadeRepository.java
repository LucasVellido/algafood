package com.algaworks.algafood.api.domain.repository;

import com.algaworks.algafood.api.domain.model.Cidade;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends CustomJpaRepository<Cidade, Long> {

//    List<Cidade> listar();
//    Cidade buscar(Long id);10
//    Cidade salvar(Cidade cidade);
//    void remover(Cidade cidade);
}
