package br.com.emanuelgabriel.projetointegracaoapi.resource;

import br.com.emanuelgabriel.projetointegracaoapi.model.CEP;
import br.com.emanuelgabriel.projetointegracaoapi.service.CepConsumerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "CEP", description = "Gerencia CEP - Código de Endereçamento Postal")
@RestController
@RequestMapping(value = "/api/v1/ceps", produces = MediaType.APPLICATION_JSON_VALUE)
public class CepResource {

    @Autowired
    private CepConsumerService cepConsumerService;

    @Operation(description = "Busca um CEP por número", summary = "Busca um CEP por número")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "401", description = "Não autorizado"),
            @ApiResponse(responseCode = "404", description = "Nenhum CEP encontrado"),
            @ApiResponse(responseCode = "500", description = "O servidor encontrou um erro não previsto") })
    @GetMapping(value = "/{cep}")
    public ResponseEntity<CEP> buscarPorCep(@PathVariable String cep){
        CEP ceps = cepConsumerService.consumerBuscarPorCep(cep);
        return ResponseEntity.ok().body(ceps);
    }

}
