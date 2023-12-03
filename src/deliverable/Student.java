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

    int studentId = 30000001;//????????????????????????
    private String studentName;
    private String email;
    private String zip_code;
    static int newStudentId;

    public Student() {
        this.studentId = generateStudentId();
    }

    public Student(Student object2) {
        this.studentId = object2.studentId;
        this.studentName = object2.studentName;
        this.email = object2.email;
        this.zip_code = object2.zip_code;
    }

    public Student(String studentName, String email, String zip_code) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.zip_code = zip_code;
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
        studentId = newStudentId;
        newStudentId++;
        return studentId;
    }

    public boolean isEmailValid() {
        boolean result = false;
        if (email.contains("@") && email.contains(".")) {
            if (email.indexOf("@") < email.indexOf(".")) {
                if (email.indexOf("@") != email.charAt(0)) {
                    if (email.indexOf(".") != email.charAt(email.length() - 1)) {
                        result = true;
                    }
                }
            }
        } else {
            result = false;
        }
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

    public boolean equals(Object obj) { // not sure about the return type 
        if (obj == this) {
            return true;
        }
        if (obj != this) {
            return false;
        } else {
            return false;
        }
    }

    public String toString() {
        return "StudentID: " + studentId
                + ", StudentName: " + studentName
                + ", Email: " + email
                + ", ZipCode: " + zip_code;
    }
}
