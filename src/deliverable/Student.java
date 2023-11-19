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
    private String email;
    private String zip_code;

    public Student() {

    }

    public Student(int studentId, String studentName, String emaill) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setEmail(String emaill) {
        this.email = email;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEmaill() {
        return email;
    }

    public String getZip_code() {
        return zip_code;
    }

    public int generateStudentId() {
        return 1;
    }

    public boolean isEmailValid() {
        boolean result = false;
        if(email.contains("@") && email.contains(".")){
            if(email.indexOf("@") < email.indexOf(".")){
                if(email.indexOf("@") != email.charAt(0)){
                    if(email.indexOf(".") != email.charAt(email.length())){
                        result = true;
                    }
                }
            }
        }
        else 
            result = false;
        return result;
    }

    public boolean isZipCodeValid() {
        /**
         * I found this code on the internet. it essentially contains the
         * requirements and restrictions of a Canadian postal code. The regex is
         * a method where you can copy the exact format , including if x idx
         * possesses a char or num.
         *
         */
        boolean result = false;
        if (zip_code.matches("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean equals(Object obj) { //Im not sure about the return type;
        return true;
    }

    public String toString() {
        return "";
    }
}
