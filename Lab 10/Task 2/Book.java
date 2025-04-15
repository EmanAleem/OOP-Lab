/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookparameters;

/**
 *
 * @author MARK 1
 */
    public class Book {
    public void print(String name){
          System.out.println("Book Name: " + name);
    }
    
    public void print(String name,int year){
          System.out.println("Book Name: " + name + " Year of publication: " + year);
    }
    
    public void print(String name,int year,double price){
          System.out.println("Book Name: " + name + " Year of publication: " + year+ " Book Price: "+ price);
    }
}
    
