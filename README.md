# Primeiro projeto em Spring Boot
## Springboot API
Estudos iniciais de Spring Boot. 

## Funcionamento
O projeto consta com alguns registros que podem ser recuperados via requisição GET, acessando um dos endpoints disponíveis.

## Executando
1 - Clone o projeto;

2 - Adicione o projeto à sua IDE indo até File > Import > Existing Maven Projects;

3 - Aguarde o Maven atualizar as dependências necessárias para execução do projeto;

4 - Execute o projeto 

__OBS: O Banco de Dados utilizado foi o H2 Database em memória.__

## Visualizando
Após ter o projeto todo em funcionamento e em execução, chame um dos recursos via navegador ou Postman (fazendo uma requisição do tipo GET).

#### Listar todos os nomes:
- localhost:8080/pessoas/ 

#### Lista por nome
- localhost:8080/pessoas/Nome%20Sobrenome 

__EX: localhost:8080/pessoas/Peter%20Parker__

#### Lista por nome que contenha
- localhost:8080/pessoas/com/Parte-do-nome-ou-letra

__EX: localhost:8080/pessoas/com/P__

## Bibliotecas
- Spring Web;

- Spring DevTools;

- Spring Data JPA;

- H2 Database;

- Flyway Migration;

- Lombok.
