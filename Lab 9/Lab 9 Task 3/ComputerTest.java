/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computertest;

/**
 *
 * @author MARK 1
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Dell", "Intel i5", 3.4, 8, 16, 3200);
        comp1.showComputerSpecs();
        comp1.runProgram();
    }
}
