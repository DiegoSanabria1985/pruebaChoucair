# Autor: XXXX

@stories
Feature: page utest

  as a user I want to enter all the data to create a new account

  @scenario1
  Scenario: enter all the data to create a new user
    Given Diego wants to create a new user
    When go to the section SER CHOUCAIR
    When Search by code and location en EMPLEOS DISPONIBLES
    When select a course INGENIERIA DE SOFTWARE
    Then Then find the selected vacancy page with the title Analista de Pruebas