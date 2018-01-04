Feature: Add new post

	Background: Login with admin role
	Given login with account "vuthelinh6484@gmail.com" and password as "8NJH9y8hL)hdQj5w"
	Then admin is on Home page and get title page is "Dashboard ‹ Selenium Vietnam Students — WordPress"


	Scenario Outline: Add new post
	
	When admin goto Create new post page
	And admin enter Title as "<Title>"
	And admin add content as "<Content>"
	And admin add tags as "<Tag>"
	And admin add categories as "<Categories>"
	And admin save new post
	And admin goto Home page
	Then admin should see new post displayed on home page
	
	
	Examples:
		|Title     |Content               |Tag   |Categories|
		|My post1p |This is the content1  |My tag|5         |
		|My2       |This2                 |Tag2  |5         |
	
	
	
	