/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrte.model;

import static com.moviesrentrte.MoviesController.Movies.ListofMovies;
import static com.moviesrentrte.MoviesController.Movies.recomended;
import static com.moviesrentrtr.moviesRTR.MoviesRentRTE.showAvailableMovies;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class UserLogin {
    
public static void loginMethod() throws IOException{
  
          
           Scanner userInput = new Scanner(System.in); 
     
       
   boolean option = true;
   boolean option1 = true;
   
   int userChoice;
   
   do{
          do{
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
        
    
                       
          
          
          
          
          
     System.out.println("");
    recomended();  
     System.out.println("");
     
     

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

