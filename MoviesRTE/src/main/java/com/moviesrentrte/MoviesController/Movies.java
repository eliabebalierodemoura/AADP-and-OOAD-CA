/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrte.MoviesController;

import com.moviesrentrtr.moviesRTR.ConsoleOutput;
import com.moviesrentrtr.moviesRTR.InputValidation;
import static com.moviesrentrtr.moviesRTR.MoviesRTE.showAvailableMovies;
import com.moviesrentrtr.moviesRTR.OutputInterface;
import com.moviesrentrte.model.UserLogin;
//import com.moviesrentrte.mainMovies.User;
//import com.moviesrentrte.mainMovies.UserLogin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @Eliabe  2022474
 */
public class Movies {
    static Thread tr = new Thread();
    private int movieID;
    
    
    public Movies(){
    
    }
   
     
      
    
     public void MovieID() throws IOException{
           
            System.out.println("-----------------------------//---------------------------------------");
            System.out.println("");
            
             // At this secction the user is aloud to see which movies are available
             // if the user chose a movie which is not available a menssage will aper to user try again.
                  List<String> list2 = new ArrayList<String>(); 
       
         List<String> list = new ArrayList<String>();  
         list.add("Movies ID and Prices");
         list.add("1,SpiderMan 7,50$");
         list.add("2,E.T The extra-territorial 3,50 NOT AVAILABLE");
         list.add("3,Elvis 7,00$");
         list.add("4,Titanic 6,00$");
         list.add("5,Cobra Kay 10,50$ NOT AVAILABLE");
         list.add("6,BatMan 7,25$");
         list.add("7,Eddie Murphy 5,25$");
         list.add("8,Gladiator 7,90$");
         list.add("9,Jackie Chan 10,30$ NOT AVAILABLE");
         list.add("10,The Business 5,99$");
         list.add("11,The Matrix 5,99$");
         list.add("12,American Pie 5,50$ NOT AVAILABLE");
         list.add("13,The Incredible Hulk 6,90$");
       
         for(int i = 0; i < list.size(); i++ ){
      
          System.out.println(list.get(i));
         }
         
           
            System.out.println("-----------------------------//---------------------------------------");
            System.out.println("");
            
             
         
      
         Scanner userInput = new Scanner(System.in); 
         
         Boolean option = true;
   
         int userChoice;
         
         
         // This loop will keep in case the user enter a wrong option
         // the user should not chose a number less than zero or greater than 13
         
      do{
         System.out.println("Pleas to rent select MOVIE ID NUMBER OR NUMBER ZERO EXIT");
          userChoice = userInput.nextInt();
                      System.out.println("");

      if (  userChoice < 0 || userChoice > 13){             
            System.out.println("ERROR! WE JUST HAVE MOVIES ID FROM 1 UP TO 13");
            System.out.println("");

            option = false;
     }
      //The unavailables movies bellow, the user will not be able to chose them
            else if(userChoice == 2 || userChoice == 5 || userChoice == 12 || userChoice == 9){
                 System.out.println("ERROR! THIS MOVIE IS NOT AVAILABLE TRY ANOTHER ONE");
                 System.out.println("");

                option = false;
            }
            else if(userChoice == 0){
                UserLogin login = new UserLogin();
                login.loginMethod();
                 option = true;

         }else{
          option = true;
             }
         }while (!option);
   
/*
      This sectioin,I have created a thread to contdown the time for the user , once the time finish
      the selected movie will be add to the list of most watched movies recomended
      */
      
      
           list.get(userChoice);
           System.out.println("YOU CHOSE:"+list.get(userChoice)+" YOU HAVE 60 SECONDS OF RENT = 1 MINUTE");
           
           try {
          for  (int t = 5 ; t > 0; t--){
            tr.sleep(1000);
            System.out.println(t);
            
        }
        }catch(Exception e){
            
            e.printStackTrace();
        }
         
        System.out.println("");
        System.out.println("MOVIE'S TIME HAS FINISHED");
        System.out.println("");

         //This is a txt file that will keep the list of movies that the user have selected
         File file = new File("MostWatched.TXT");
         FileWriter fw = new FileWriter (file, true);
         PrintWriter pw = new PrintWriter(fw);
         
         pw.println(list.get(userChoice));
         pw.close();
         
         
        recomended();
           System.out.println("");    
      
  
     }
     
     /*
        We will call this method to the first page of our code , to keep inform the user
        the list of movies that the user have selected to keep they updated.
     This method is acctualy just reading the "MostWatched.txt" with the list of movies
     */
   public static void  recomended () throws IOException{
        
       BufferedReader myReader = new BufferedReader(new FileReader("MostWatched.TXT"));
       
       System.out.println("LIST OF THE MOST WATCHED MOVIES RECOMMENDED");
       
       String line = myReader.readLine();
       String [] lineArr;
   //    String[] instrumentNames;

       System.out.println(line);
       
     // instrumentNames = line.split(",,");
        
     while ((line = myReader.readLine()) != null){
             lineArr = line.split(",,");       
            System.out.println(lineArr[0]);
            
    
         }
 
   }
}



  /*                    

    
    
   public void moviesAvailable(){
        
   String [] moviesAvailable = {
   
"Movies ID and Prices",
"1,SpiderMan 7,50$erritorial 3,50",
"3,Elvis 7,00$",
"2,E.T The extra-t",
"4,Titanic 6,00",
"5,Cobra Kay 10,50$",
"6,BatMan 7,25$",
"7,Eddie Murphy 5,25$",
"8,Gladiator 7,90$",
"10,The Business 5,99$",
"11,The Matrix 5,99$",
"12,American Pie 5,50$",
"13,The Incredible Hulk 6,90$",
  
   };
      
   for(int i = 0; i < moviesAvailable.length; i++ ){
       
   System.out.println(moviesAvailable[i]);
}
 
      }
}




*/