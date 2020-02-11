#language: pt
#coding: utf-8
Funcionalidade: Cadastro de usuarios na aplicacao

  Contexto: 
    Dado usuario esta na tela principal
    Quando tocar no menu do aplicativo
    E tocar no menu de login
    E tocar na opcao de realizar um novo cadastro

  Esquema do Cenario: Cadastrar um usuario inexistente
    E usuario inserir o "<nome de usuario>"
    E inserir seu "<email>"
    E inserir sua "<senha>"
    E confirmar sua "<senha>"
    E inserir seu primeiro "<nome>"
    E inserir seu ultimo "<sobrenome>"
    E inserir seu numero de "<telefone>"
    E selecionar seu "<pais>"
    E inserir seu "<estado>" ou provincia
    E inserir seu "<endereco>" com numero
    E inserir a "<cidade>" que reside
    E inserir o "<cep>" do seu endereco
    E tocar para realizar seu cadastro
    Entao estara cadastrado e ja logado no sistema

    Exemplos: 
      | nome de usuario  | email            | senha   | nome    | sobrenome | telefone       | pais   | estado | endereco      | cidade    | cep       |
      | NewUser2001      | test@email01.com | Gus!123 | Gustavo | Santos    | (11)91234-5678 | Brazil | SP     | Rua test, 00  | Guarulhos | 12345-678 |

  Esquema do Cenario: Cadastrar um usuario inexistente
    E usuario inserir o "<nome de usuario>"
    E inserir seu "<email>"
    E inserir sua "<senha>"
    E confirmar sua "<senha>"
    E inserir seu primeiro "<nome>"
    E inserir seu ultimo "<sobrenome>"
    E inserir seu numero de "<telefone>"
    E selecionar seu "<pais>"
    E inserir seu "<estado>" ou provincia
    E inserir seu "<endereco>" com numero
    E inserir a "<cidade>" que reside
    E inserir o "<cep>" do seu endereco
    E tocar para realizar seu cadastro
    Entao mensagem de usuario ja existente aparecera

    Exemplos: 
      | nome de usuario | email            | senha   | nome    | sobrenome | telefone       | pais   | estado | endereco      | cidade    | cep       |
      | NewUser001      | test@email01.com | Gus!123 | Gustavo | Santos    | (11)91234-5678 | Brazil | SP     | Rua test, 00  | Guarulhos | 12345-678 |
