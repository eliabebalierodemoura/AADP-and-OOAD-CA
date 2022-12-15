/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moviesrentrte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class InputValidation {
    public static List<String[]> validateInput(String filename) throws IOException{
       InputInterface  dataInput = new FileInput(filename);
      dataInput.nextLine();
      String[] lineArr;
       List<String[]> moviesAvailable = new ArrayList<>();

    String line;
    
    while ((line = dataInput.nextLine()) != null){
                lineArr = line.split(",,");
           moviesAvailable.add(lineArr);
            System.out.println(lineArr[0]);
    
    }
    return moviesAvailable;
    
}
}