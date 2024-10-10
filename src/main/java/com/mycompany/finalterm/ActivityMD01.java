/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalterm;

/**
 *
 * @author User
 */
public class ActivityMD01 {
   
    public static void main(String[] args) {
        
        //declare and initialize
        char[][] array = new char [3][4];
        
        //fill the array
        for (int i = 0; i < array.length; i++) {    
    
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = '*';
            }
    }
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++){
                 System.out.print(array[i][j] + " ");
             }
              System.out.println();
         }
     
    }
}
