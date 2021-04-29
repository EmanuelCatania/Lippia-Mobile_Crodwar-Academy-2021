Feature: El usuario realiza una reserva

  @PHPDeprecado
  Scenario: Realizar Reserva en PHP Travels
    Given el usuario se encuentra en la home de la app
    When el usuario tapea el icono VISA
    And el usuario completa los datos desde <salida> hasta <llegada>
    And el usuario completa el campo nombre: Emanuel, apellido Catania, email emailfalso@123.com, celular +5492611234567, notas Viajo para abandonar de mis amigos :'(
    And el usuario tapea el boton SUMBIT
    Then el usuario verifica que se realizo correctamente la reserva
