/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author MARK 1
 */
public class Doctor {
    private String name;
    private String specialization;
    private int experienceYears;

    public Doctor(String name, String specialization, int experienceYears) {
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public void showDoctorInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experienceYears + " years");
    }

    public void addPatient(String patientName) {
        System.out.println("Patient " + patientName + " added by Dr. " + name);
    }

    public String getName() {
        return name;
    }
}
