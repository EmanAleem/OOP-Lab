/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospitalsystem;

/**
 *
 * @author MARK 1
 */
public class HospitalSystem {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Ali", "Cardiologist", 10);
        Doctor doc2 = new Doctor("Sara", "Neurologist", 7);
        Hospital h1 = new Hospital("City Hospital", "Lahore");
        h1.addDoctor(doc1);
        h1.addDoctor(doc2);
        h1.showHospitalInfo();
        h1.showAllDoctors();
        doc1.addPatient("Ahmed");
    }
         }

    