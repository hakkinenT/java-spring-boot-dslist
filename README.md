
# DSList

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://github.com/hakkinenT/java-spring-boot-dslist/blob/master/LICENSE) 
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## Sobre o projeto
O projeto DSList foi uma aplicação desenvolvida durante o Intensivão Java Spring, ministrado pelo Professor [Nelio Alves](https://github.com/acenelio) da [DevSuperior](https://devsuperior.com.br).

A aplicação consiste em uma API de Games, onde é possível listar todos os Games cadastrados, além de listar Games com base em uma lista.

## Modelo Conceitual
![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

> **FONTE:** [dslist-backend](https://github.com/devsuperior/dslist-backend)

## Funcionalidades

- Listar todos os Games
- Pesquisar um Game pelo seu id
- Listar todas as listas de Games cadastradas
- Pesquisar um Game pela lista
- Mudar a posição de um Game na lista


## Tecnologias Utilizadas

- Java
- Spring boot
- JPA / Hibernate
- PostgreSQL
- H2

## Aprendizados

Neste projeto foi possível aprender sobre o funcionamento do Spring Boot, como criar o projeto usando o [Spring initializr](https://start.spring.io/), 
como configurar os perfis de projeto: teste, homologação e produção, além de como usar os verbos HTTP para criar a API REST.


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/hakkinenT/java-spring-boot-dslist.git
```

Entre no diretório do projeto

```bash
  cd java-spring-boot-dslist
```

Rode a aplicação

```bash
  ./mvnw spring-boot:run
```


## Rodando os testes

Para rodar os testes, rode o seguinte comando

```bash
  mvn test
```


## Autores

- [@hakkinenT](https://github.com/hakkinenT)
