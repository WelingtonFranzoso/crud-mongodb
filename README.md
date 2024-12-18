# CRUD MongoDB
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) que gerencia usuários e seus endereços, utilizando o banco de dados NoSQL MongoDB. O objetivo principal é fornecer uma interface simples para realizar operações de CRUD sobre essas entidades. A aplicação utiliza o MapStruct para converter entre Entity e DTO, e também implementa classes Builder para construção da resposta final de usuário e endereço.

# Funcionalidades
- Cadastro de Usuário: Permite criar um novo usuário com informações básicas.
- Cadastro de Endereço: Permite cadastrar um endereço relacionado a um usuário.
- Listagem de Usuários: Exibe todos os usuários cadastrados.
- Atualização de Usuário: Permite a atualização dos dados de um usuário existente.
- Remoção de Usuário: Exclui um usuário e seus respectivos endereços.
- Listagem de Endereços: Exibe os endereços cadastrados para um usuário específico.
- Atualização de Endereço: Permite a atualização dos dados de um endereço associado a um usuário.
- Remoção de Endereço: Exclui um endereço relacionado a um usuário.

# Tecnologias utilizadas
- Java: Linguagem de programação principal.
- Spring Boot: Framework para criação de aplicações Java.
- Maven: Gerenciador de dependências e construção do projeto.
- Docker: Containerização da aplicação para facilitar a execução e deployment.
- MongoDB: Banco de dados NoSQL para persistência das informações de usuários e endereços.

# Como executar o projeto

## Back end
### Pré-requisitos: 
- Java 17
- Maven
- MongoDB(local ou via Docker)

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/crud-mongodb.git

# entrar na pasta do projeto back end
cd crud-mongodb

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
