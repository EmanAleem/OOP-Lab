/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computermain;

/**
 *
 * @author MARK 1
 */
public class ComputerMain {
public static void main(String[] args) {
        Computer com=new Computer();
        Computer L=new Laptop();
        Computer D=new Desktop();
        
        com.runProgram();
        L.runProgram();
        D.runProgram();
    }
}

