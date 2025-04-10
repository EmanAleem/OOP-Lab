/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computertest;

/**
 *
 * @author MARK 1
 */
public class Computer {
    String brand;
    Processor processor;
    RAM ram;

    public Computer(String brand, String model, double speed, int cores, int capacity, int ramSpeed) {
        this.brand = brand;
        this.processor = new Processor(model, speed, cores);
        this.ram = new RAM(capacity, ramSpeed);
    }

    public void showComputerSpecs() {
        System.out.println("Brand: " + brand);
        processor.showSpecs();
        ram.showSpecs();
    }

    public void runProgram() {
        System.out.println(brand + " is running a program...");
    }
}

    

    

