/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.moviesrentrtr.moviesRTR;

import java.util.List;

/**
 *
 * @author HP
 */
public class ConsoleOutput implements OutputInterface {

    private List<String[]> data;
    public ConsoleOutput(){
   
        
    }
    @Override
    public  boolean outputData(List<String[]> data) {
        return false;
    }
    
}
