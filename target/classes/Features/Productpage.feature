Feature: Product selection and adding to cart feature
Scenario: verify the product added to cart
Given the user is on demoblaze page
When the user navigate to product category
And the user click on a product to view its details
And the user add the product to cart
Then the user gets the alert message "Product added"