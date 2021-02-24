package br.com.emanuelgabriel.projetointegracaoapi.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.webmvc.ui.SwaggerConfig;

@OpenAPIDefinition(
        info = @Info(title = "Consumer de API REST externa", description = "Documentação da API REST - CEP",
        termsOfService = "Termos de uso em construção",
        version = "1.0.0",
        contact = @Contact(name = "Emanuel Gabriel Sousa", email = "emanuel.gabriel.sousa@hotmail.com",
        url = "https://emanuelgabriel.github.io/")
        )
)
public class ConfigOpenApi extends SwaggerConfig {
}
