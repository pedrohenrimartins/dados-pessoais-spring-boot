# Dados Pessoais — Spring Boot

Projeto acadêmico em desenvolvimento utilizando **Java e Spring Boot**, desenvolvido ao longo da disciplina de desenvolvimento back-end.

O projeto está sendo construído progressivamente conforme os conteúdos da matéria são apresentados, permitindo aplicar na prática conceitos de **Java, Spring Boot, API REST, HTTP, JSON e desenvolvimento back-end**.

## 🎯 Objetivo do Projeto

O objetivo é desenvolver uma aplicação back-end utilizando **Spring Boot**, acompanhando a evolução dos conteúdos estudados durante a disciplina.

O projeto terá como base operações de **CRUD (Create, Read, Update e Delete)**, porém sua estrutura e funcionalidades serão definidas e implementadas progressivamente durante o desenvolvimento da matéria.

## 🚧 Status

**Em desenvolvimento.**

Novas funcionalidades e conceitos serão adicionados conforme o avanço da disciplina.

Por esse motivo, a documentação deste README será atualizada ao longo do desenvolvimento do projeto.

## 🛠️ Tecnologias

* **Java**
* **Spring Boot**
* **Spring Web MVC**
* **Maven**
* **Jackson / ObjectMapper**
* JSON
* Git
* GitHub

## 📌 Conteúdos Praticados Atualmente

Até o momento, o projeto possui implementações relacionadas a:

* Criação de aplicação Spring Boot
* Controllers
* Endpoints HTTP
* Retorno de dados em JSON
* Criação de objetos Java para representar dados
* Serialização de objetos utilizando Jackson
* Uso do `ObjectMapper` para serialização manual

## 🔌 Endpoint Atual

### GET `/hello`

Endpoint criado para testar o funcionamento da aplicação e o retorno de objetos Java em formato JSON.

Exemplo:

```json
{
  "nome": "Pedro Henrique Gomes Martins",
  "texto": "Olá, mundo! Meu primeiro endpoint Spring Boot"
}
```

Também existe uma implementação de teste utilizando o endpoint:

```text
GET /hello-manual
```

que utiliza o `ObjectMapper` para realizar a serialização manual do objeto.

## 📁 Estrutura

```text
dados-pessoais/
├── src/
│   └── main/
│       └── java/
├── pom.xml
├── .gitignore
└── README.md
```

## ▶️ Como Executar

Clone o repositório:

```bash
git clone https://github.com/pedrohenrimartins/dados-pessoais.git
```

Entre na pasta:

```bash
cd dados-pessoais
```

Execute utilizando Maven:

```bash
mvnw.cmd spring-boot:run
```

Depois que a aplicação for iniciada, os endpoints podem ser acessados pelo navegador ou por ferramentas de teste de API.

## 📚 Próximos Passos

O projeto continuará sendo desenvolvido conforme o avanço da disciplina.

Entre os conceitos que serão trabalhados está a implementação de operações **CRUD**, além de outros conteúdos de desenvolvimento back-end que serão incorporados ao projeto durante as próximas etapas.

> **Nota:** a estrutura e as funcionalidades descritas neste README podem ser atualizadas conforme o projeto evolui.
