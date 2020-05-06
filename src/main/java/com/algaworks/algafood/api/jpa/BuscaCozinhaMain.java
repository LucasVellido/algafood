package com.algaworks.algafood.api.jpa;

import com.algaworks.algafood.api.AlgafoodApiApplication;
import com.algaworks.algafood.api.domain.model.Cozinha;
import com.algaworks.algafood.api.domain.repository.CozinhaRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class BuscaCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
//
//        Cozinha cozinha = cozinhaRepository.buscar(1L);
//
//        System.out.println("cozinha = " + cozinha.getNome() );
    }
}
