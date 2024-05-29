#Author: John
  #Language: en

Feature: Eliminación de vuelos directos.
  Como administrador Quiero poder cancelar los vuelos que hayan sido creados

  Scenario: Cancelacion exitosa de un vuelo
    Given estoy en la pagina de gestion de vuelos
    When selecciono la accion de cancelar un vuelo y confirmo la cancelacion
    Then se valida la cancelacion del vuelo