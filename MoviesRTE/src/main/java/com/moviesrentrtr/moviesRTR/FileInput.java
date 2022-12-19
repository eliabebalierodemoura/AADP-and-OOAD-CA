/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrtr.moviesRTR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *@Eliabe 2022474
 *
 * 
 * FileInput is implementing InputInterface method 
 */
public class FileInput implements InputInterface {
     private BufferedReader myReader;
     
     //The file provided in Movies class, will fill up String filename
     // and then read and print by consoleOutput
     public FileInput(String filename) throws FileNotFoundException, IOException {
      myReader = new BufferedReader(new FileReader(filename));

      String line = myReader.readLine();
    
        
 
       System.out.println(line);

     }
    @Override
      // This method come from InputInterface class     
    public String nextLine() {
         try {
             return myReader.readLine();
         } catch (IOException ex) {
             Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
         
         return null;
         }
    }
    
}
