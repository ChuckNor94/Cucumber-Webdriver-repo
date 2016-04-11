Feature: This is my dummy feature file

Background: 
Given I am on the zoo site

Scenario: To populate the contact form
When I click on "contact"
And I enter "Name test" into the name field
And I enter "18 Pitcairn Street" into the address field
And I enter "4312" into the postcode field
And I enter "Email test" into the email field
And I submit the contact form
Then I check I am on the confirmation page
#And I close the browser

