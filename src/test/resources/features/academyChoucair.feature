# Autor: XXXX

@stories
Feature: page Empleos

  As a user I want to enter the jobs module and search for available vacancies

  @scenario1
  Scenario: search for vacancies that fit your experience
    Given Diego wants to find vacancies
    When go to the section SER CHOUCAIR
    When Search by code and location en EMPLEOS DISPONIBLES
    When select a course INGENIERIA DE SOFTWARE
    Then Then find the selected vacancy page with the title Analista de Pruebas