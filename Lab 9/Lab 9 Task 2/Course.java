/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentsystem;

/**
 *
 * @author MARK 1
 */
import java.util.ArrayList;

public class Course {
    String courseTitle, courseCode;
    ArrayList<Students> enrolledStudents = new ArrayList<>();

    public Course(String title, String code) {
        this.courseTitle = title;
        this.courseCode = code;
    }

    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Students student) {
        enrolledStudents.remove(student);
    }

    public void showAllStudents() {
        for (Students s : enrolledStudents) {
            s.showStudentInfo();
            System.out.println("----------------");
        }
    }

    public void showCourseInfo() {
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Enrolled Students: " + enrolledStudents.size());
    }
}

    

