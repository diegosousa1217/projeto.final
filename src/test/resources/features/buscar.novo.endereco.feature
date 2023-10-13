@regressivos @buscaCep
Feature: Buscar cep
  Como usuario do site dos correios
  Quero informar um cep ou endereco
  Para buscar enderecos diferentes

  Background: Acessar a home
    Given que esteja na pagina principal do correios

  @positivos
  Scenario: Buscar Cep
    When buscar as informacoes
    Then valido o retorno da pesquisa