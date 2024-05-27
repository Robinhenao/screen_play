#Author: Robinson, Alejo, John
  #Language: en

Feature: Creacion de vuelos directos.
  #Como administrador quiero crear vuelos directos con toda la informacion para agregarlos al sistema.

  Scenario: Creacion exitosa de un vuelo directo
    Given estoy en la pagina de creacion de vuelos directos
    When ingreso la informacion obligatoria requerida en los campos del formulario
    Then el sistema deberia mostrar un mensaje de confirmacion de que el vuelo ha sido creado exitosamente