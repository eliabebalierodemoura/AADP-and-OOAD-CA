/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.moviesrentrte.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class UserLoginIT {
     UserLogin user;
    public UserLoginIT() {
        user = UserLogin();
             System.out.println("loginMethod");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of loginMethod method, of class UserLogin.
     */
    @Test
    public void testLoginMethod() throws Exception {
        System.out.println("loginMethod");
        UserLogin.loginMethod();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private UserLogin UserLogin() {
                System.out.println("login - Method");
 
        throw new UnsupportedOperationException("Ready to be used"); 
        
    }
    
}
