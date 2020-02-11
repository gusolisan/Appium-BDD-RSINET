#language: pt
#coding: utf-8
Funcionalidade: Pesquisar produto pela tela
  Deve pesquisar itens do catalogo de pesquisa fornecido pela aplicacao

  Contexto: 
    Dado usuario esta na tela principal

  @CenarioPositivo_PesquisaPorClique
  Cenario: Pesquisar e encontrar um produto utilizando filtros
    Quando usuario tocar na categoria Headphones
    E tocar no filtro
    E selecionar uma determinada preferencia de produtos
    E tocar para filtrar
    Entao deve encontrar o produto desejado na tela pesquisa
    E ser correspondente ao mesmo na tela de produto

  @CenarioNegativo_PesquisaPorToque
  Cenario: Pesquisar e nao encontrar um produto utilizando filtros
    Quando usuario tocar na categoria Headphones
    E tocar no filtro
    E selecionar duas determinadas preferencias de produtos
    E tocar para filtrar
    Entao nao deve encontrar produto algum
