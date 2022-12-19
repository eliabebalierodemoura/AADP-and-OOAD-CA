/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrtr.moviesRTR;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Matheus 2019378
 * 
 * This class are being used to read our csv file, validateInput are being called in the moviesCSV class
 * once the file is catch  a while loop will run it line of the file.
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