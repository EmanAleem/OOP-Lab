/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentsystem;

/**
 *
 * @author MARK 1
 */
public class StudentSystem {
    public static void main(String[] args) {
        Students s1 = new Students("Ayesha", "BS123", "ayesha@gmail.com");
        Students s2 = new Students("Zain", "BS456", "zain@gmail.com");

        Course c1 = new Course("Java Programming", "CS101");
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);

        c1.showCourseInfo();
        c1.showAllStudents();
        s1.submitAssignment();
    }
}

