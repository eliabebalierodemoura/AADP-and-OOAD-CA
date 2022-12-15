/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moviesrentrte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FileInput implements InputInterface {
     private BufferedReader myReader;
     
     public FileInput(String filename) throws FileNotFoundException, IOException {
      myReader = new BufferedReader(new FileReader(filename));

      String line = myReader.readLine();
    
        
 
       System.out.println(line);

     }
    @Override
            
    public String nextLine() {
         try {
             return myReader.readLine();
         } catch (IOException ex) {
             Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
         
         return null;
         }
    }
    
}
