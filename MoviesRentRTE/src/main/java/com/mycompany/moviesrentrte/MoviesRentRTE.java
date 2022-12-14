/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.moviesrentrte;

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

    public static void main(String[] args)throws FileNotFoundException, IOException {
          
           
        
           
  
       Scanner userInput = new Scanner(System.in); 
      
       
       
      
       
       
   boolean option = true;
          do{
	         System.out.println("Pleas enter 1 - LOGIN or 2 - NEW ACCOUNT");
	         int userChoice = userInput.nextInt();
	                  
	         if(userChoice == 1){
	         option = true;

	       
	         }
	         else if( userChoice == 2){
	         option = true;
	     }
	           
	     else{
	          option = false;

	             }
	   }
	     
	          while(!option);
          
          
                   
    /*     this is another way to do the loop with switch
     do{
         System.out.println("Pleas enter 1 - LOGIN or 2 - NEW ACCOUNT");
         int userChoice = userInput.nextInt();
     
         switch(userChoice){
             case 1:
                 userChoice = 1;
          choice = true;

             break;
              case 2:
                  userChoice = 2;
                  choice = true;
             break;
             default:
             choice = false;
            System.out.println("ERROR!");
         }
         }while (!choice);
      }
  */
    
         
	  
          
            System.out.println("");
           System.out.println("-----------------------------//---------------------------------------");
            System.out.println("");
             
        
          removeRecord("Movies_file.csv","13",1, ",");
        }
    
    
    
    public static void removeRecord(String filepath,String removeItem,int positionOfItem, String delimiter) throws IOException{
    int position = positionOfItem - 1;    
    String tempFile = "temp.csv";
    File oldFile = new  File(filepath);
    File newFile = new  File(tempFile);

    String currentLine;
    String data[];
    
    try
    {
        FileWriter fw = new FileWriter(tempFile,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        
        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);
         
        while((currentLine = br.readLine())!= null){
            data = currentLine.split(",");
            if(!(data[position].equalsIgnoreCase(removeItem))){
                pw.println(currentLine);
            }
        }
        
        pw.flush();
        pw.close();
        fr.close();
        bw.close();
        br.close();
        fw.close();
        oldFile.delete();
        File dump = new File(filepath);
        newFile.renameTo(dump);
    }
   
    
    
    
    catch (Exception e){
    }
     List<String[]> moviesAvailable = InputValidation.validateInput("Movies_file.csv");
        OutputInterface output = new ConsoleOutput();
      output.outputData(moviesAvailable);
          
    }
}
