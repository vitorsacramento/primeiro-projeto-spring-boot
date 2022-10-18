# Primeiro projeto em Spring Boot
## Springboot API
Estudos iniciais de Spring Boot. 

## Funcionamento
O projeto consta com um endpoint '/pessoas' e este contém um método "listar" que faz uma requisição do tipo GET. A requisição retorna uma pequena lista com alguns dados, tais como id, nome, idade etc.

## Executando
1 - Clone o projeto;

2 - Adicione o projeto à sua IDE indo até File > Import > Existing Maven Projects;

3 - Aguarde o Maven atualizar as dependências necessárias para execução do projeto;

4 - Execute o projeto 

__OBS: O Banco de Dados utilizado foi o H2 Database em memória.__

## Visualizando
Após ter o projeto todo em funcionamento e em execução, chame o recurso https://locahost:8080/pessoas via navegador ou Postman, fazendo uma requisição do tipo GET.

## Bibliotecas
- Spring Web;

- Spring DevTools;

- Spring Data JPA;

- H2 Database;

- Flyway Migration;

- Lombok.
