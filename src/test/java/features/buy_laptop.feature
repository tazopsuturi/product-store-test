Feature: Choose Laptop and add to card

  As a user, I want to visit the page, choose laptop and then add it to the card

  Scenario: Choose Laptop category, then choose laptop and add it to the card
    When I choose laptop category
    When I get the name of product
    When I choose laptop
    Then Adding to card page opens
    When I click Add to card
    When I accept the alert
    When I press cart button
    Then I check if I picked correct product
