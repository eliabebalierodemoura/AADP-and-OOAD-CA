/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.moviesrentrtr.moviesRTR;

import com.moviesrentrte.MoviesController.Movies;
import com.moviesrentrte.model.UserLogin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 * This code CA code was done by 
 * @Eliabe 2022474 and @Matheus 2019378 
 */
public class MoviesRTE {
     
    

    /* This is our main method where we have called 
      * called the loginMethod, where the user will have they firt page to enter with they details.
      *I got the UserLogin instantiated to call the loginMethod
    */
  public static void main(String[] args) throws IOException {
        System.out.println("");

        UserLogin login  = new UserLogin ();
        //login.recomended();
        //movies.moviesAvailable();
        login.loginMethod();
        
        
      
     
 
            
  }
             
/*
  showAvailableMovies() is another method that is calling moviesID.
  *moviesID will show the list of movies available and they ID, so the user will be able 
  *to chose they movie by calling its id, the movie will last 60 second and then will be add to the 
  *list of most recommended watched movies.
  *
  *
  */
   public static void showAvailableMovies() throws IOException{
       
        Movies movies  = new Movies ();      
        //movies.moviesAvailable();
        movies.MovieID();
        
      }
 
      
   
}
