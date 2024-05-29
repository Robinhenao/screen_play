#Author: Robinson
  #Language: en

Feature: Creacion de vuelos directos.
  #Como administrador quiero crear vuelos directos con toda la informacion para agregarlos al sistema.

  Scenario: Creación exitosa de un vuelo directo
    Given que ingrese a la pagina web y pulse el boton de crear vuelo
    When ingreso la informacion obligatoria requerida en los campos del formulario
    Then el sistema confirma que el vuelo fue creado exitosamente