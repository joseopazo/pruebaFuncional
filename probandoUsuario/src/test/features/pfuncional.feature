Feature: llenar datos en contactUS

  @test_josecito
  Scenario: ingresar datos con credenciales validas
    Given que el usuario se vaya a la seccion contacUs
    When el usuario ingresa sus datos a cada campo
    Then se debe permitir registarlo
