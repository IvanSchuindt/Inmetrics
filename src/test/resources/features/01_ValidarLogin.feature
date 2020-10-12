#language: pt

  Funcionalidade: Validar Login
    Como um usuario cadastrado pelo sistema
    Eu quero poder validar o login da aplicacao
    Para que eu possa acessar o sistema

  Esquema do Cenário: Validar login com sucesso
    Dado um usuario "<usuario>" cadastrado pelo sistema
    Quando preenche o campo senha com "<senha>"
    E aciona o botao entre
    E acessa a tela "<tela>"
    Então o usuario visualiza a tela "<link>"

    Exemplos:
    | usuario             | senha      | tela     | link                                  |
    | teste@testes.com.br | 123qwe!@#  | Login    | http://www.inmrobo.tk/accounts/login/ |