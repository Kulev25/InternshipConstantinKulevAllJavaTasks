@AddAProductScenario
Feature: Add a product
  As an Administrator
  I want to add a new product
  So that it is shown under assigned category on the OpenCart website

  Background:
    Given I am loggee in as an Administrator on the OpenCart website
    And Product List page is opened

  @AddAProduct @AddIphone25
  Scenario: Add a product on the OpenCart website
    Given I am at Product List page
    When I add a new product
    And Press on the "+" in the right corner
    And Populate fields Product Name & Meta Tag Title
      | Product name | Meta Tag Title |
      | Iphone 25    | iphone         |
    And Press on Data tab
    And Populate the field Model
      | Model  |
      | i256SJ |
    And Press [Save] button
    And Open the [Product List] page to confirm that the product was created
    Then The product "Iphone 25" is displayed in the List of Products