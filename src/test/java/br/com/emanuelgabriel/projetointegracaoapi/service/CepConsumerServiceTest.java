package br.com.emanuelgabriel.projetointegracaoapi.service;

import br.com.emanuelgabriel.projetointegracaoapi.model.CEP;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CepConsumerServiceTest {


    @Autowired
    private CepConsumerService consumerService;

    @Test
    public void consumerBuscarCepTest(){
        CEP cep = this.consumerService.consumerBuscarPorCep("64004215");
        assertNotNull(cep);

        assertEquals("PI", cep.getEstado());
        assertEquals("Teresina", cep.getCidade());

    }


}
