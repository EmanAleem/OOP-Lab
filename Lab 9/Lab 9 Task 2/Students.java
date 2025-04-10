/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentsystem;

/**
 *
 * @author MARK 1
 */
    public class Students {
    String name, studentID, email;

    public Students(String name, String studentID, String email) {
        this.name = name;
        this.studentID = studentID;
        this.email = email;
    }

    public void submitAssignment() {
        System.out.println(name + " submitted the assignment.");
    }

    public void showStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentID);
        System.out.println("Email: " + email);
    }
}

    
