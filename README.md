# Desafio Back-end PicPay
Este repositório contém a solução para o desafio técnico proposto pelo PicPay para a posição de desenvolvedor back-end.

## Tecnologias Utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-greendark)
- [Spring Security](https://img.shields.io/badge/Spring%20Security-white)
- [H2 Database](https://img.shields.io/badge/H2-Database-blue)
- [Docker](https://img.shields.io/badge/Docker-blue)
- [Swagger](https://img.shields.io/badge/Swagger-purple)

## Funcionalidades

- Cadastro de usuários (comuns e lojistas) com informações únicas como CPF/CNPJ e e-mail.
- Realização de transferências entre usuários, com validação de saldo e tipo de usuário.
- Consulta a um serviço autorizador externo antes de finalizar a transferência.
- Notificação de pagamento via serviço de terceiros.
- API RESTful documentada com Swagger.

## Arquitetura

A aplicação segue a arquitetura de microsserviços, com os seguintes componentes:

- **Serviço de Usuários**: Responsável pelo cadastro e gerenciamento de usuários.
- **Serviço de Transações**: Responsável pelas operações de transferência entre usuários.
- **Serviço Autorizador**: Simula a autorização externa para as transações.
- **Serviço de Notificações**: Simula o envio de notificações aos usuários.

## Endpoints

- **`POST /usuarios`**: Cria um novo usuário.
- **`POST /transacoes`**: Realiza uma nova transferência entre usuários.
- **`GET /usuarios/{id}/extrato`**: Obtém o extrato de transações de um usuário.

## Considerações Finais
Eu desenvolvi esse projeto como parte do processo seletivo para o PicPay para a posição de desenvolvedor back-end, escolhi o Java para esta aplicação, sendo a minha linguagem de programação principal.

Para mais detalhes sobre o desafio original, consulte o repositório oficial do PicPay:https://github.com/PicPay/picpay-desafio-backend
