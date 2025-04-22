/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinebookingsystem;

/**
 *
 * @author MARK 1
 */
abstract public class Booking {
    protected String customerName;
    protected String date;

    public Booking(String customerName, String date) {
        this.customerName = customerName;
        this.date = date;
    }

    abstract void confirmBooking();
}

