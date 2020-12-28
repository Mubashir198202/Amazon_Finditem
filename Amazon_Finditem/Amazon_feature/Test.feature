Feature: Users can purchase, sell & return from the online Amazon website 
	Description: "User can search the iPhone, check the price, and purchase the" 
                         "iPhone with a valid credit card."                          
       
Background: 
	Given user can able to open chrome browser 
	And  user can able to enter Amazon URL 
	And  user can clik on Singin button 
	And  user can enter username 
	And  user can on clik continue 
	And  user can enter pasword 
	And  user can cilk on Login Button 
@iphone 
Scenario: User can search the iPhone, check the price, and purchase the iPhone 
	Given Enter in search box product name As a IPhone 
	When Customer able to see list of the iPhone on screen 
	And Customer can print the entire price 
	And Customer can click on third number iPhone 
    Then Customer verify the price 
#@laptop 
#Scenario: User can search the laptop, check the price and buy the laptop 
#	Given Enter in search box product name As a laptop 
#	When Customer able to see list of the laptop on screen 
#	And Customer can print the entire laptop price 
#	And Customer can click on third number laptop 
#	Then Customer verify the laptop price 