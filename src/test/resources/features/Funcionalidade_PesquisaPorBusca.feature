#language: pt
#coding: utf-8
Funcionalidade: Pesquisar produto pelo campo de pesquisa
  Deve pesquisar itens pelo campo de pesquisa fornecido pela aplicacao

  Contexto: 
    Dado usuario esta na tela principal

  Esquema do Cenario: Pesquisar por produto existente
    Quando inserir o "<produto existente>" desejado no campo de pesquisa
    E executar a pesquisa
    Entao o "<produto existente>" desejado aparece na tela de pesquisa

    Exemplos: 
      | produto existente      |
      | HP CHOMEBOOK 14 G1(ES) |

  Esquema do Cenario: Pesquisar por produto inexistente
    Quando inserir o "<produto inexistente>" no campo de pesquisa
    E executar a pesquisa
    Entao o "<produto inexistente>" desejado nao aparece na tela

    Exemplos: 
      | produto inexistente |
      | Dress               |
