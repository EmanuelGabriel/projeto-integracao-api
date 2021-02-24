package br.com.emanuelgabriel.projetointegracaoapi.resource;

import br.com.emanuelgabriel.projetointegracaoapi.model.CEP;
import br.com.emanuelgabriel.projetointegracaoapi.service.CepConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/ceps", produces = MediaType.APPLICATION_JSON_VALUE)
public class CepResource {

    @Autowired
    private CepConsumerService cepConsumerService;

    @GetMapping(value = "/{cep}")
    public ResponseEntity<CEP> buscarPorCep(@PathVariable String cep){
        CEP ceps = this.cepConsumerService.consumerBuscarPorCep(cep);
        return ResponseEntity.ok().body(ceps);
    }

}
