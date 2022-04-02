<p align="center">
  <img width="400" height="400" alt="JavaFlix" src="https://user-images.githubusercontent.com/81054281/161361540-53905d64-3482-42d2-a6dd-5111cf664442.png">
</p>




<h1 align="center">Trabalho prático - Programação Orientada a Objetos</h1>

<p align="center">Desenvolver um projeto utilizando os conceitos de Programação Orientada a Objetos </p>

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=FINALIZADOO&color=GREEN&style=for-the-badge)

## Objetivos

- Comandos básicos e avançados de uma linguagem orientada a objetos
- Os conceitos de encapsulamento, herança e polimorfismo

## 📚 Contéudo 
- Modularidade
- Encapsulamento
- Arquitetura MVC
- Herança
- Tratamento de Exceção
- Polimorfismo

## JavaFlix - Uma locadora de filmes e séries

Este trabalho tem como objetivo realizar um projeto utilizando os conceitos de POO. Dessa forma, foi criado o JavaFlix, uma loja que vende series e filmes, contando com as seguintes funcionalidades:

## 🔨 Modo Cliente

    - Cadastrar
    - Login
    - Buscar produto na loja
    - Visualizar, adicionar e remover itens ao carrinho de compras
    - Finalizar a compra
    - Perfil do cliente
        - Alterar dados cadastrados (nome e senha)
        - Deletar a conta
    - Histórico de compras já realizadas 

## 🔨 Modo Administrador

    - Cadastrar e Logar Administrador
    - Inserir produto
        - Filme
        - Serie
    - Remover produto
    - Visualização do estoque
    - Pesquisar item no estoque
    - Lista dos clientes cadastrados

## ✔️ Técnicas e tecnologias utilizadas

- ``Linguagem Java``
- ``Netbeans``
- ``Banco de dados MySQL``

## 🔄 TUTORIAL DE CONEXÃO COM BANCO DE DADOS MYSQL

O banco de dados utilizado pelo grupo foi o MySQL. Dessa forma, faça a instalação do MySQL no site oficial(https://dev.mysql.com/).
Após a instalação e configuração do MySQL, crie uma conexão no MySQL Workbench ou obtenha os dados da conexão que deseja conectar.

![image](https://user-images.githubusercontent.com/81054281/160032580-6702702e-5968-4e96-87f4-3c269f726e06.png)

Logo em seguida, guarde os dados que irão aparecer na tela, eles serão utilizados para fazer a conexão com banco de dados.

    - Hostname (IP do servidor)
    - Port (porta)
    - Usarname (usuario)
    - Password (senha)

![image](https://user-images.githubusercontent.com/81054281/160032824-ad288162-d44f-4b59-a0df-cb16cd39d638.png)

Insira o script disponibilizado pelo grupo no banco de dados MySQL, e logo em seguida, execute a criação das tabelas e inserções. 

Sabe aquelas informações que foram guardas anteriormente? Verifique se elas estão de acordo com o que está presente na pasta _br.ufv.com.Conexao.java:__

    - Connection connection (variável que faz a conexão com o banco de dados)
    - String DRIVER (recebe endereço/local onde encontrar o driver de conexão)
    - String SERVIDOR (IP do servidor - hostname)
    - String PORTA (porta para conexão com o banco - port)
    - String BANCO (nome da sua tabela do banco de dados - tabela que você criou)
    - String USUARIO (nome de usuário criado - user)
    - String SENHA (senha do usuário - password)
    - String URL (caminho da conexão percorrido pelo Java conjunto de tudo)

Caso, tenha alguma alteração do seu banco de dados local, faça as modificações de acordo com suas informações. Assim que o sistema precisar acessar o banco de dados será mostrada uma mensagem avisando na primeira vez.
