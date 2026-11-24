/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labgraderecord;

/**
 *
 * @author Administrator
 */
public class LabGrade {
    private String studentName;
    private int quizScore;
    private int labScore;
    
    public LabGrade(){
    }
    
    public LabGrade(String studentName, int quizScore, int labScore){
        this.studentName = studentName;
        
        if(quizScore >= 0 && quizScore <= 100){
            this.quizScore = quizScore;
        }else{
            this.quizScore = 0;
        }
        if(labScore >= 0 && labScore <= 100){
            this.labScore = labScore;
        } else {
            this.labScore = 0;
        }
    }
    
    public boolean updateScore(int quizScore, int labScore){
        if( quizScore >= 0 && quizScore <= 100 && labScore >= 0 && labScore <= 100){
            this.quizScore = quizScore;
            this.labScore = labScore;
            
            return true;
        }
        
        return false;
    }
    
    public double getFinalGrade(){
        return (quizScore * 0.40) + (labScore * 0.60);
    }
    
    public boolean isPassing(){
        return getFinalGrade() >= 75.0;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
}
