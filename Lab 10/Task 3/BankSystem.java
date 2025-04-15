/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banksystem;

/**
 *
 * @author MARK 1
 */
public class BankSystem {

    public static void main(String[] args) {
        Payment general=new Payment();
        CreditCardPayment credit=new CreditCardPayment();
        PayPalPyment pal=new PayPalPyment();
        
        general.processPayment();
        credit.processPayment();
        pal.processPayment();
    }
}

