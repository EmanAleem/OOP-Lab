/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatortest;

/**
 *
 * @author MARK 1
 */
public class CalculatorTest {
    public static void main(String[] args) {
       Calculator cal=new Calculator();
        System.out.println("Add integer numbers: " + cal.add(6, 9));
        System.out.println("Add double numbers: " + cal.add(6.89, 9.67));
        System.out.println("Subtract integer numbers: " + cal.sub(6, 9));
        System.out.println("Subtract double numbers: " + cal.sub(8.89, 5.49));
        System.out.println("Multiply integer numbers: " + cal.mul(2, 5));
        System.out.println("Multiply double numbers: " + cal.mul(6.45, 9.278));
        System.out.println("Divide integer numbers: " + cal.divide(89, 3));
        System.out.println("Divide double numbers: " + cal.divide(99.45, 3.78));
    }
}

