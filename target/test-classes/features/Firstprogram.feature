

Feature: Loginto Application

#Scenario: Application Login
#Given User openin Application
#When user Login to Application with username "1212121212" and Password "Dress@123"
#And Home page should be display
#Then close window

 
#Scenario:  Application Login and logout
#Given User openin Application
#When user Login to Application with username "1212121212" and Password "Dress@123"
#And Home page should be display
#And click on profile icon
#And click on logout
#And Logout verification
#Then close window


#Scenario:  Application PLP verification
#Given User openin Application
#When user Login to Application with username "1212121212" and Password "Dress@123"
#And Home page should be display
#And click on Allensolly jeans
#And click on Jeans PLP
#And wait for impliticlityon
#And verfied the page
#Then close window

Scenario:  Application PDP verification
Given User openin Application
When user Login to Application with username "1212121212" and Password "Dress@123"
And Home page should be display
And click on Allensolly jeans
And click on Jeans PLP
And wait for impliticlityon
And verfied the page
And PLP size select
And click on add to cart
And go to cart
And click on place order
And place order continue
And Thank you for your order
#And verified on thankyou page
Then close window

