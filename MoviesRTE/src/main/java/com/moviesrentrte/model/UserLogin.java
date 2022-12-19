/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrte.model;

//import static com.moviesrentrte.MoviesController.Movies.ListofMovies;
import static com.moviesrentrte.MoviesController.Movies.recomended;
import static com.moviesrentrtr.csvFile.moviesCSV.ListofMovies;
import static com.moviesrentrtr.moviesRTR.MoviesRTE.showAvailableMovies;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @Matheus 2019378
 */
public class UserLogin {
    
public static void loginMethod() throws IOException{
  /* In loginMethod,l there is a scanner where the user can input the details , and then 
     it will be chacked in user class if is true or false
*/
          
           Scanner userInput = new Scanner(System.in); 
     
       
   boolean option = true;
   boolean option1 = true;
   
   int userChoice;
   
   do{
          do{
              
              // Lopps for keep user trying input the correct values
	            System.out.println("Pleas enter 1 - LOGIN OR 2 - NEW ACCOUNT");
                    userChoice = userInput.nextInt();
                   
	             if(userChoice == 1){
                     System.out.println("");  
                     
                     System.out.println("Pleas enter Your NAME");
                     String userName = userInput.next();
              
                     System.out.println("Pleas enter Your PASSSWORD");
                     String usewrPassword = userInput.next();
    
                     User user = new User(userName,usewrPassword);   
	             option = true;
                 
                     System.out.println("WELLCOME BACK !!! "+userName);
                 
                 /*
                     If choice is 2, then user is required to create a new account with: name, email and password
                     */
                    }
	         else if( userChoice == 2){
                 System.out.println("");  

                 System.out.println("Pleas enter Your NAME");
                 String userName = userInput.next();
              
                 System.out.println("Pleas enter Your EMAIL");
                 String userEmail = userInput.next();
                 
                 System.out.println("Pleas enter Your PASSSWORD");
                 String userPassword = userInput.next();
                 
                 User user = new User(userName,userEmail, userPassword);
                 
                 
                 System.out.println("WELLCOME !!! "+userName);
	         option = true;
                 
                 
	     }
	           
	     else{
	          option = false;

	             }
	   }
	     
	          while(!option);
        
    
                       
          
          
          
          
      //Once the user login is succssful, it will call a recomended method to show list of recomended movies    
     System.out.println("");
    recomended();  
     System.out.println("");
     
     
       /*
     At this part we can chose a option if you want to continus or live the programming movie
  which will bring you to the login page again
     */
     do{
         System.out.println("Pleas enter 1 TO SEE LIST OF MOVIES 2 TO MOVIES AVAILABLE OR 3 EXIT");
         userChoice = userInput.nextInt();
     
         switch(userChoice){
             case 1:
                 ListofMovies();
               option = true;
              break;
              
              case 2:
                 showAvailableMovies();
               option = true;
              break;
              
              case 3:
               option1 = true;
             break;
             
             default:
             option = false;
            System.out.println("ERROR!");
         }
         }while (!option);
   
     }while (option1);
      
    
            System.out.println("");
            System.out.println("-----------------------------//---------------------------------------");
            System.out.println("");
      }
    
    
    
    
}

