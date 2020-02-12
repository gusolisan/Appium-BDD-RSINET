#language: pt
#coding: utf-8
Funcionalidade: Pesquisar produto pela tela
  Deve pesquisar itens do catalogo de pesquisa fornecido pela aplicacao

  Contexto: 
    Dado usuario esta na tela principal

  @CenarioPositivo_PesquisaPorClique
  Cenario: Pesquisar e encontrar um produto correspondente ao encontrado
    Quando usuario tocar na categoria Headphones
    E tocar no primeiro headphone
    Entao deve encontrar o produto desejado na tela de compra

  @CenarioNegativo_PesquisaPorToque
  Cenario: Pesquisar e nao encontrar um produto utilizando filtros
    Quando usuario tocar na categoria Headphones
    E tocar no filtro
    E selecionar duas determinadas preferencias de produtos
    E tocar para filtrar
    Entao nao deve encontrar produto algum
