/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homeautomationcontrol;

/**
 *
 * @author MARK 1
 */
public class SmartLight implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("SmartLight: Lights are now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight: Lights are now OFF.");
    }
}
    
