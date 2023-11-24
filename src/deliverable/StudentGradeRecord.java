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
    
    public StudentGradeRecord(StudentGradeRecord gradeBook){ //im not sure about what i did here
        grades = gradeBook.grades;
        student = gradeBook.student;
    }
    
    public double compteFinalGrade(double[] assessmentWeights){
        double finalGrade;
        double productSum = 0;
        double assSum = 0;
        for(int i = 0; i < grades.length; i++){
            double product  = grades[i] * assessmentWeights[i];
            productSum += product;
        }
        for(int j = 0; j < assessmentWeights.length; j++){
            assSum += assessmentWeights[j];
        }
        finalGrade = productSum / assSum;
        return finalGrade;
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

    public double[] getGrades(int k) {
        
        return k;
    }

    public Student getStudent() {
        return student;
    }
    
    public int getNumberOfAssessments(){
        return 1;
    }
    
    public static char computeLetterGrades(double fin){ //Pretty easy to code || Im not sure the fin variable is used for
        char letterGrade;
        if(fin >= 90)
            letterGrade = 'A';
        else if(fin >= 80)
            letterGrade = 'B';
        else if(fin >= 70)
            letterGrade = 'C';
        else if(fin >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }
    
    public boolean equals(Object obj) { // not sure about the return type 
        if (obj == this){
            return true;
        }
        if(obj != this){
            return false;
        }
        else{
            return false;
        }
    }
    
    public String toString(){
        return "";
    }
}
