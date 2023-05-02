#language:pt
  Funcionalidade: Login

    Cenario: Fechar a modal ao clicar fora da mesma
      Dado que a modal esteja sendo exibida
      Quando for realizado um clique fora da modal
      Entao a janela modal deve ser fechada

    Cenario: Fechar a modal ao clicar no ícone fechar
      Dado que a modal esteja sendo exibida
      Quando for realizado um clique no ícone de fechar da modal
      Entao a janela modal deve ser fechada

    Cenario: Link Create New Account
      Dado que a modal esteja sendo exibida
      Quando for realizado um clique no link Create New Account
      Entao a pagina Create Account deve ser exibida

    Cenario: Realizar login com campos obrigatórios
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login |chronos|
        |password |senha |
        |remember |false |
      Quando for realizado o clique no botao sign in
      Entao deve ser possivel logar no sistema

    Cenario: Realizar login com todos os campos
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login |chronos|
        |password |senha |
        |remember |true |
      Quando for realizado o clique no botao sign in
      Entao deve ser possivel logar no sistema

    Cenario: Realizar login com usuário inválido
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login |invalido|
        |password |senha |
        |remember |false |
      Quando for realizado o clique no botao sign in
      Entao o sistema devera exibir uma mensagem de erro

    Cenario: Realizar login com senha inválida
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login |chronos |
        |password |invalida|
        |remember |false |
      Quando for realizado o clique no botao sign in
      Entao o sistema devera exibir uma mensagem de erro

    Cenario: Realizar login com usuário em branco
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login | |
        |password |senha|
        |remember |false|
      Entao o botao sign in deve permanecer desabilitado

    Cenario: Realizar login com senha em branco
      Dado que a modal esteja sendo exibida
      Quando os campos de login sejam preenchidos da seguinte forma
        |login |chronos |
        |password | |
        |remember |false |
      Entao o botao sign in deve permanecer desabilitado