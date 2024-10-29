#Author: Teber
Feature: Consulter les menus de home page

  Scenario Outline: 
    Given Admin est bien connectee avec username correct "Admin" et password correct "admin123"
    When Admin clique sur le menu "<menu>"
    Then Admin sur la page de menu cliquee

    Examples: 
      | menu  |
      | Admin |
      | PIM   |
