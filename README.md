# projeto-integracao-api
Este projeto visa a comunicação entre API's.  

### Neste projeto será mostrado um Consumer de uma API REST externa.

#### RestTemplate é uma classe que está contida no framework Spring MVC.
RestTemplate é uma classe utilitária que permite interagir com serviços RESTful a partir de uma aplicação Java usando o Framework Spring. 
É um recurso que suporta quase todos os verbos do protocolo HTTP, como por exemplo GET, POST, HEAD, PUT ou DELETE, apesar de usarmos apenas o método GET neste artigo para consumir um serviço RESTful e converter a resposta JSON em objetos Java.

### Documentação de como consumir um serviço da web RESTful no Spring:

more info: https://spring.io/guides/gs/consuming-rest/


:information_source: OBS: Os dados são públicos e podem ser obtidos pelo link: <a href="https://api.postmon.com.br/v1/cep/64046-700">Dados públicos de Código de Endereçamento Postal/CEP.</a>


#### Imagens do projeto:

Recursos/endpoints de busca de CEP pelo seu número pelo programa client chamado POSTMAN.

![alt text](https://github.com/EmanuelGabriel/dsdelivery-assets/blob/main/Captura%20de%20tela%20de%202021-02-24%2015-26-43.png)


Recursos/endpoints de busca de CEP e sua documentação feita com OPENAPI.
![alt text](https://github.com/EmanuelGabriel/dsdelivery-assets/blob/main/Captura%20de%20tela%20de%202021-02-24%2015-25-22.png)


