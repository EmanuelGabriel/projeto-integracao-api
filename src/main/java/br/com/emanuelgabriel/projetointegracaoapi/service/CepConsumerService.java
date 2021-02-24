package br.com.emanuelgabriel.projetointegracaoapi.service;

import br.com.emanuelgabriel.projetointegracaoapi.model.CEP;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepConsumerService {

    @Value("${url.api.cep}")
    private String url;

    public CEP consumerBuscarPorCep(String cep){
        String urlFinal = url + cep;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(urlFinal, CEP.class);
    }

}
