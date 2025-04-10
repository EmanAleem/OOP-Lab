/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalsystem;

/**
 *
 * @author MARK 1
 */
 import java.util.ArrayList;

public class Hospital {
    private String name;
    private String location;
    private ArrayList<Doctor> doctors;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added to " + name);
    }

    public void showAllDoctors() {
        System.out.println("\n--- Doctors in " + name + " ---");
        for (Doctor d : doctors) {
            d.showDoctorInfo();
            System.out.println("---------------------");
        }
    }

    public void showHospitalInfo() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Location: " + location);
    }
}

    

  