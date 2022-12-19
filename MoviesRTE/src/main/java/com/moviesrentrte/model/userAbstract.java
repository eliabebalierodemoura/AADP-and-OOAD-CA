/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrte.model;

import java.io.IOException;

/**
 *
 * @Matheus 2019378 
 * 
 * This abstract class we are using to implement in our users class 
 * to make an object user
 */
public abstract class userAbstract {
        String name;
  	
	String email;
	
	String password;

	
	 
	    
      
       
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static void userIput(){
        }
        
}
    





