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
 *
 * @author HP
 */
public class MoviesRentRTE {
     
    

    
  public static void main(String[] args) throws IOException {
        System.out.println("");

        UserLogin login  = new UserLogin ();
        //login.recomended();
        //movies.moviesAvailable();
        login.loginMethod();
        
        
      
     
 
            
  }
             

   public static void showAvailableMovies() throws IOException{
       
        Movies movies  = new Movies ();      
        //movies.moviesAvailable();
        movies.MovieID();
        
      }
 
      
   
}
