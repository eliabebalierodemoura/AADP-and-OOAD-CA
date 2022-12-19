/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrtr.csvFile;

import com.moviesrentrtr.moviesRTR.ConsoleOutput;
import com.moviesrentrtr.moviesRTR.InputValidation;
import static com.moviesrentrtr.moviesRTR.MoviesRTE.showAvailableMovies;
import com.moviesrentrtr.moviesRTR.OutputInterface;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @Eliabe 2022474
 *
 */

//This csv file has 13 movies , the method ListofMovies() will bring us a list of movies tha we have
public class moviesCSV {
        public static void ListofMovies() throws IOException{
    System.out.println("");
   
    List<String[]> moviesAvailable = InputValidation.validateInput("Movies_file.csv");
        OutputInterface output = new ConsoleOutput();
      output.outputData(moviesAvailable);
     
            
            System.out.println("");
       
            
             
      /* if the user chose 1 it will show them the movies available to rent or 2 to exit
            and we have a loop in case of wrong enter
            */
      Scanner userInput = new Scanner(System.in); 
      Boolean option = true;
      
          do{
         System.out.println("Pleas enter 1 TO SEE MOVIES AVAILABLE OR 2 EXIT");
         int userChoice = userInput.nextInt();
     
         switch(userChoice){
             case 1:
                 showAvailableMovies();
               option = true;
              break;
             
              case 2:    
               option = true;
             break;
             
             default:
             option = false;
            System.out.println("ERROR!");
         }
         }while (!option);
          
            
                    System.out.println("");

             
          
      }
      
     
}
