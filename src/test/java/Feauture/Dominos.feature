Feature: I want to order pizza in dominos 

Background:
Given Launch the URL and maximize

@testcase1
Scenario Outline: Order online pizza 

When Click order online
Then click address and give address 
And Click Locate me 
Then navigate to order online Page
Then click add to cart for peppy panneer 
And Click add to cart for Veg pizza
Then click add cart for magherita
And click Beverages 
Then navigate to beverages page 
And click needed quantity 
Then click checkout 