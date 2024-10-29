#Author: Teber
Feature: Orange HRM Login

  Background: 
    Given Admin sur la page Login

  Scenario: connection valide
    When Admin entrer le username valide "Admin" et passwaord valide "admin123"
    Then Administrateur deriger vers la page accueil qui contient le message "Dashboard"

  Scenario: connection invalide
    When Admin entrer le username valide "Admin" et passward invalide "admin12"
    Then Admin est encore dans la page  login qui contient le message "Invalid credentials"
