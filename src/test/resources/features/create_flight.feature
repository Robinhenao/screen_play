#Author: Robinson, Alejo, John
  #Language: en

  Feature:
    Como administrador, Quiero crear vuelos directos con toda la información para agregarlos al sistema.

  Scenario: Creación exitosa de un vuelo directo
    Given estando en la página de creación de vuelos directos
    When ingresó la información obligatoria requerida en los campos del formulario Y hago clic en el botón "Confirmar"
    Then el sistema genera automáticamente el número de vuelo siguiendo las reglas de la OACI y la IATA Y se vea el mensaje "Creación exitosa del vuelo directo"