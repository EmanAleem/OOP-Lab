/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homeautomationcontrol;

/**
 *
 * @author MARK 1
 */
public class HomeAutomationControl {

    public static void main(String[] args) {
       RemoteControl tv = new SmartTV();
        RemoteControl light = new SmartLight();
        RemoteControl speaker = new SmartSpeaker();

        System.out.println("=== Controlling SmartTV ===");
        tv.turnOn();
        tv.turnOff();

        System.out.println("\n=== Controlling SmartLight ===");
        light.turnOn();
        light.turnOff();

        System.out.println("\n=== Controlling SmartSpeaker ===");
        speaker.turnOn();
        speaker.turnOff();
    }
}
    