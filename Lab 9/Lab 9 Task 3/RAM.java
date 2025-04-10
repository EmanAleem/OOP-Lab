/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computertest;

/**
 *
 * @author MARK 1
 */
public class RAM {
        int capacity;
        int speed;

        RAM(int capacity, int speed) {
            this.capacity = capacity;
            this.speed = speed;
        }

        void showSpecs() {
            System.out.println("RAM Capacity: " + capacity + " GB");
            System.out.println("RAM Speed: " + speed + " MHz");
        }
    }
