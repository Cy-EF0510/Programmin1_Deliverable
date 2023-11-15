/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class Student {
    private int studentId;
    private String studentName;
    private String emaill;
    
    public Student(){
        
    }

    public Student(int studentId, String studentName, String emaill) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.emaill = emaill;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmaill() {
        return emaill;
    }
    
    public int generateStudentId(){
        return 1;
    }
    
    public boolean isEmailValid(){
        return true;
    }
    
    public boolean isZipCodeValid(){
        return true;
    }
    
    public boolean equals(Object obj){ //Im not sure about the return type;
        return true;
    }
    
    public String toString(){
        return "";
    }
}
