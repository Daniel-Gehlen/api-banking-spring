# Configuração do Projeto Spring Boot

Este é um guia passo a passo para configurar um projeto Spring Boot para serviços financeiros.

## Configuração do Projeto

1. Acesse o [Spring Initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.2.2&packaging=jar&jvmVersion=17&groupId=com.financialservices&artifactId=banking&name=banking&description=Projeto%20de%20demonstra%C3%A7%C3%A3o%20para%20servi%C3%A7os%20financeiros&packageName=com.financialservices.banking&dependencies=web,data-jpa,h2,postgresql) com a configuração pré-definida.

2. Verifique se as seguintes opções estão selecionadas:
   - **Type:** Gradle Project
   - **Language:** Java
   - **Platform Version:** 3.2.2
   - **Packaging:** Jar
   - **Java Version:** 17
   - **Group:** com.financialservices
   - **Artifact:** banking
   - **Name:** banking
   - **Description:** Projeto de demonstração para serviços financeiros
   - **Package Name:** com.financialservices.banking
   - **Dependencies:**
     - Spring Web
     - Spring Data JPA
     - H2 Database
     - PostgreSQL Driver

3. Clique no botão "Generate" para baixar o arquivo ZIP contendo o esqueleto do projeto.

4. Extraia o conteúdo do arquivo ZIP em um diretório de sua escolha (se usar o Eclipse IDE, extraia no work-bench).

5. Abra o diretório do projeto em sua IDE preferida.

6. O projeto já está configurado com as dependências necessárias no `build.gradle`, incluindo Spring Web, Spring Data JPA, H2 Database e PostgreSQL Driver.

7. Certifique-se de ter um banco de dados PostgreSQL configurado. Você pode ajustar as configurações de conexão no arquivo `application.properties` conforme necessário.

8. Agora você está pronto para começar a desenvolver seu projeto!

## Executando o Projeto

Para executar o projeto, siga estas etapas:

1. Navegue até o diretório do projeto no Eclipse, por exemplo:
  - src/main/java
  -  package com.financialservices.banking
  -      BankingApplication

3. Clique com o botão direito e execute para iniciar o aplicativo Spring Boot:
