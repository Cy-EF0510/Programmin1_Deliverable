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
    
    public StudentGradeRecord(StudentGradeRecord copyGradeBook){ //im not sure about what i did here
        this.grades = copyGradeBook.grades;
        this.student = copyGradeBook.student;
    }
    
    public double computeFinalGrade(double[] assessmentWeights){
        double fin;
        double productSum = 0;
        double assSum = 0;
        for(int i = 0; i < grades.length; i++){
            double product  = grades[i] * assessmentWeights[i];
            productSum += product;
        }
        for(int j = 0; j < assessmentWeights.length; j++){
            assSum += assessmentWeights[j];
        }
        fin = productSum / assSum;
        return fin;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public void setAllGrade(double[] allGrades){
        this.allGrades = allGrades; // I have no idea if this correct but i know this is incorrect
if(allGrades.length !=)
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public double[] getGrade(int k) {??????????????????????????????
        return ;
    }
    
    public double[] getAllGrade(){
        double[] copyGradeList;
        return copyGradeList.copyOf(grades, grades.length);  // I have no idea if this correct but i know this is incorrect
    }

    public Student getStudent() {
        return student;
    }
    
    public int getNumberOfAssessments(double[] assessmentWeights){
        return assessmentWeights.length;
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
