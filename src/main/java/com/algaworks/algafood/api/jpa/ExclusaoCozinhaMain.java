package com.algaworks.algafood.api.jpa;

import com.algaworks.algafood.api.AlgafoodApiApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ExclusaoCozinhaMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
//
//        Cozinha cozinha1 = new Cozinha();
//        cozinha1.setId(1L);
//        cozinha1.setNome("Brasileira");
//
//        cozinhaRepository.remover(1l);

    }
}
