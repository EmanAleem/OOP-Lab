/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinebookingsystem;

/**
 *
 * @author MARK 1
 */
public class FlightBooking extends Booking {
    public FlightBooking(String customerName, String date) {
        super(customerName, date);
    }

    @Override
    void confirmBooking() {
        System.out.println("Ticket confirmed for flight for " + customerName + " on " + date + ".");
    }
}



  