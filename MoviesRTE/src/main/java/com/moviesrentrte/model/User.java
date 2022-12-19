/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrte.model;

//import com.moviesrentrte.mainMovies.UserLogin;
import java.io.IOException;

/**
 *
 *@Eliabe 2022474
 */
public class User extends userAbstract {
  
	        public User(String name, String password) throws IOException {
		this.name = name;
		this.password = password;
        
                
                   // Users Example
  //  User user = new User("Eliabe", "eliabe@gmail.com","1234");
  //User user1 = new User("Matheus", "matheus@gmail.com","1235");
  
    /*
       For this class, we have twwo users as examples. If you enter the details of this
       two saved users the login will be successful, otherwise will fail
  */
             
                     boolean choice = true;
                if (name.equalsIgnoreCase("Eliabe") && password.equalsIgnoreCase("1234") || 
                        name.equalsIgnoreCase("Matheus") && password.equalsIgnoreCase("1235")){
                        choice = true;
                }
                        else{
                    System.out.println();
                    System.out.println("ERRO THE NAME AND PASSWORD DO NOT MATCH!");
                    System.out.println();
                    UserLogin login = new UserLogin();
                    login.loginMethod();
                    }
      
}
              /* This constructor is for user new account 
                The user will be required to enter name, email and password to create an account
                */
        
                 public User(String name, String email, String password){
		this.name = name;
		this.email = email;
		this.password = password;
                 }
      
       
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

        
}
    




