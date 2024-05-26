#Author: Robinson, Alejo, John
  #Language: en

Feature: Creacion de vuelos directos
  Como administrador
  Quiero crear vuelos directos con toda la informacion
  Para agregarlos al sistema

  Scenario: Creacion exitosa de un vuelo directo
    Given estoy en la página de creación de vuelos directos
    When ingreso la información obligatoria requerida en los campos del formulario
    And hago clic en el botón "Confirmar"
    Then el sistema debería mostrar un mensaje de confirmación de que el vuelo ha sido creado exitosamente
    And el nuevo vuelo debería aparecer en la lista de vuelos directos sistema genera automáticamente el número de vuelo siguiendo las reglas de la OACI y la IATA Y se vea el mensaje "Creación exitosa del vuelo directo"