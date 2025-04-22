/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.onlinebookingsystem;

/**
 *
 * @author MARK 1
 */
public class OnlineBookingSystem {
    public static void main(String[] args) {
        Booking train = new TrainBooking("Ali", "2025-04-23");
        Booking flight = new FlightBooking("Sara", "2025-04-25");

        train.confirmBooking();
        flight.confirmBooking();
    }
}

  