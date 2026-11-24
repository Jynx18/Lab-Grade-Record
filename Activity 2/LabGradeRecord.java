/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labgraderecord;

/**
 *
 * @author Administrator
 */
public class LabGradeRecord {

    public static void main(String[] args) {
        
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);
        
        System.out.println(ana.getFinalGrade() + "; " + (ana.isPassing()? "passing" : "not passing"));
        System.out.println(ben.getFinalGrade() + "; " + (ben.isPassing()? "passing" : "not passing"));
        System.out.println(ana.updateScore(95, 101) + "; grade stays " + ana.getFinalGrade());
        System.out.println(ana.updateScore(74, 75) + "; " + ana.getFinalGrade() + "; " + (ana.isPassing()? "passing" : "not passing"));
        System.out.println(ana.updateScore(75, 75) + "; " + ana.getFinalGrade() + ": " + (ana.isPassing()? "passing" : "not passing"));
        System.out.println("Still " + ben.getFinalGrade() + "; " + (ana.isPassing()? "passing" : "not passing"));
    }
}
