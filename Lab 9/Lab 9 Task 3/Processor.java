/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computertest;

/**
 *
 * @author MARK 1
 */
public class Processor {
        String model;
        double speed;
        int cores;

        Processor(String model, double speed, int cores) {
            this.model = model;
            this.speed = speed;
            this.cores = cores;
        }

        void showSpecs() {
            System.out.println("Processor Model: " + model);
            System.out.println("Speed: " + speed + " GHz");
            System.out.println("Cores: " + cores);
        }
    }

    
    
