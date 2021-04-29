Feature: El usuario envia un mensaje

  @PHPContactUs
  Scenario Outline:  el usuario se pone en contacto con PHP Travels
    Given el usuario se encuentra en la home
    When el usuario tapea el menu
    And el usuario tapea el boton Contac Us
    And el usuario ingresa los datos: Name <name>, Email <email>, Subject <subject> y Message <message>
    And el usuario tapea el boton Final Contac Us
    Then el usuario verifica mensaje de confirmacion

    Examples:
      | name    | email          | subject          | message                  |
      | emanuel | ema@gmail.com  | Abandono de visa | restauren el boton visa  |
      | test    | test@gmail.com | BOTON VISA       | Reintegren el boton VISA |

