/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class StudentGradeRecord {
    private double[] grades;
    private Student student;
    
    public StudentGradeRecord(){
        
    }

    public StudentGradeRecord(double[] grades, Student student) {
        this.grades = grades;
        this.student = student;
    }
    
    public StudentGradeRecord(StudentGradeBook gradeBook){ //im not sure about what i did here
        grades = gradeBook.grades;
        student = gradeBook.student;
    }
    
    public double compteFinalGrade(double[] assessmentWeights){
        return 1;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void setAllGrade(double[] allGrades){
        this.allGrades = allGrades; // I have no idea if this correct but i know this is incorrect
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public double[] getGrades() {
        return grades;
    }

    public Student getStudent() {
        return student;
    }
    
    public int getNumberOfAssessments(){
        return 1;
    }
    
    public static char computeLetterGrades(double fin){ //Pretty easy to code || Im not sure the fin variable is used for
        char letterGrade = 'O';
        double grade = 0;
        if(grade >= 90)
            letterGrade = 'A';
        else if(grade >= 80)
            letterGrade = 'B';
        else if(grade >= 70)
            letterGrade = 'C';
        else if(grade >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }
    
    public boolean equals(Object obj){
        return true;
    }
    
    public String toString(){
        return "";
    }
}
