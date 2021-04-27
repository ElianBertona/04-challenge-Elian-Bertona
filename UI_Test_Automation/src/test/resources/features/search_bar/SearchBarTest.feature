Feature: Validate search bar behavior
         As a user I want to use the search bar in different way searching by exact product and category
         and I want to show the suggestions and categories in search bar to help me in my task
         and I want so show the search history in search helper
      
Scenario: Validate suggestions and categories
    Given user is on the home page
    When user type in search bar
    Then the user show the suggestions and categories in search bar 


Scenario Outline: Validate search history
    Given user is on the home page
    When user search a product in search bar using <productName>
    Then the user show the <productName> in search history in the search bar 

    Examples: 
      | productName        |
      |"Table"  					 |
      

Scenario Outline: Search products by category 
   Given user is on the home page
   When user search a product in search bar using <category>
   Then the user show products by <category> in the products page

   Examples: 
     | category    |
     |"Bathroom"   |
      

Scenario Outline: Search one product using exact match
  Given user is on the home page
   When user search a product in search bar using <productName>
   Then the user show the <productName> in first place in the products page

   Examples: 
     | productName                                                                                            |
     | "HOMCOM Stainless Steel Wall mounted Bathroom Mirror Cabinet Double Doors 600W (mm)"                   |
     | "HOMCOM 2 Seater Modern Double Seat Sofa Compact Loveseat Couch Sofabed Padded Linen Wood Legs - Grey" |
     | "HOMCOM 360° Rotating Corner Desk Storage Shelf Combo Workstation L-Shaped - Black"                    |



