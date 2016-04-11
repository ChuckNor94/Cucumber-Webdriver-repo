Feature: Search for a book

#Background:
	#Given I am on the london library search page
Scenario Outline: I enter a search	
Given I am on the london library search page
When I select the search option <searchOption>
And I enter the search text <searchText>
And I click the search button
Then I will get <searchResults> search results 
#And I close the browser
    Examples: 
      | searchOption | searchText   | searchResults     |
      | Author       | Tegmark, Max | 1 Results Found |
      | Title        | The end of faith | 2 Results Found  |   
      | Title        | The hidden reality | 1 Results Found |
	