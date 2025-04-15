/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatortest;

/**
 *
 * @author MARK 1
 */
public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
     public double add(double a,double b){
        return a+b;
    }
      public int sub(int a, int b){
        return a+b;
    }
       public double sub(double a, double b){
        return a-b;
    }
      public int mul(int a, int b){
        return a*b;
    }
         public double mul(double a, double b){
        return a*b;
    }
       public int divide(int a, int b){
              if(b!=0)return a/b;
              else
               System.out.println("Cannot divide by zero"); 
        return 0;
    }
          public double divide(double a, double b){
              if(b!=0.0)return a/b;
              else
               System.out.println("Cannot divide by zero"); 
        return 0;
    }
        
}
    
