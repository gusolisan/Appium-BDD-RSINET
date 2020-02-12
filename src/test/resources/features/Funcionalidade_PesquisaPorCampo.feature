#language: pt
#coding: utf-8
Funcionalidade: Pesquisar produtos pelo campo de pesquisa
  Deve pesquisar itens pelo campo de pesquisa fornecido pela aplicacao

  Contexto: 
    Dado usuario esta na tela principal

  @CenarioPositivo_PesquisaPorCampo
  Esquema do Cenario: Pesquisar por produto existente
    Quando inserir o "<produto existente>" desejado no campo de pesquisa
    E executar a pesquisa
    Entao o "<produto existente>" desejado aparece na tela de pesquisa

    Exemplos: 
      | produto existente       |
      | HP CHROMEBOOK 14 G1(ES) |

  @CenarioNegativo_PesquisaPorCampo
  Esquema do Cenario: Pesquisar por produto inexistente
    Quando inserir o "<produto inexistente>" no campo de pesquisa
    E executar a pesquisa
    Entao o "<produto inexistente>" desejado nao aparece na tela

    Exemplos: 
      | produto inexistente |
      | Dress               |
