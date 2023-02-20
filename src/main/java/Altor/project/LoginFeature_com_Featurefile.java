//#Day:Nov22
//#Feature:login with valid data
//
//#Scenario: login to Swag lab
//
//#Given Brwoser launch and url
//#When  Enter The Username
//#And Enter The Password
//#Then Click login
//
//#.................................................
//
//
//#Day:Nov23
//
//#Datable
//
//#Feature:login with Data table
//
//#Scenario: login to swag lab
//   #Given Browser launch and url
//   # When Enter valid  data from Datatable
//    #|Username|Password|
//    #|standard_user|secret_sauce|
//   # Then click login
//   
//  
//   
//   #Day:Nov23
//   
//   #Feature:login with muliple data
//   
//   #Scenario Outline: scenario description
//   	#Given Browser launch and url
//   		#When user enter the loginid "<Username>"
//   		#When user enter the logincode "<Password>"
//   		#Then click login
//   		
//   		#Examples:
//   		#|Username|Password|
//       # |standard_user|secret_sauce|
//       
//       # |performance_glitch_user|secret_sauce|
//        
//       #|problem_user|secret_sauce|
//       
//       #.............................................................
//       
//    #Day:Nov27   
//       
//     # Feature:login with muliple data
//   
//    # Scenario Outline: scenario description
//    # 	Given Browser launch and url
//   		 # When user enter the loginid "<Username>"
//   		 # When user enter the logincode "<Password>"
//   		 # Then click login
//   		
//   	 # 	Examples:
//   	 # 	|Username|Password|
//      #   |standard_user|secret_sauce|
//       
//       # |performance_glitch_user|secret_sauce|
//        
//   #  |problem_user|secret_sauce|
//           
//       #..................................................
//       
// Feature:login to AltoroMutual website
// 
//  Scenario Outline: scenario description
//   	Given Browser launch and url
//   	    When Navigate to sigin application
//   		When user enter the loginid "<Username>"
//   		When user enter the logincode "<Password>"
//   		Then click login
//   		
//   		
//   		Examples:
//   		|Username|Password|
//   		|demo_user|demo_password|
//   		
//   		  |admin|admin|
//   		 
//Scenario: View Account Summary
//When View Account Summary
//And Select the value of 80001
//Then Click go button
//
//Scenario: Transfer funds
//When click on the transfer fund button
//When select the to account
//And Enter the tranfer amount
//Then Click on Transfer money
//
//Scenario:View Recent Transactions
//When Click recent view transaction
//
//Scenario: Contactus
//When Click the contact button
//When Click Online form button
//When Enter the email address
//When Enter the subject
//When Enter the comment
//Then Click submit button
//
//
//
//
//
//   		  
//   		  
//   		  
//   		
//        
//        