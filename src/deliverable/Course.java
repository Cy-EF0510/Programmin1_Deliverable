/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class Course {

    private String name;
    private String number;
    private String section;
    private String semester;
    private int year;

    public Course() {
        this.name = "John Doe";
        this.number = "0000000";
        this.section = "0000";
        this.semester = "Null";
        this.year = 2023;
    }

    public Course(Course object2) {
        this.name = object2.name;
        this.number = object2.number;
        this.section = object2.section;
        this.semester = object2.semester;
        this.year = object2.year;
    }

    public Course(String n, String num, String sect, String sem, int y) {
        name = n;
        number = num;
        section = sect;
        semester = sem;
        year = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getSection() {
        return section;
    }

    public String getSemester() {
        return semester;
    }

    public int getYear() {
        return year;
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

    @Override
    public String toString() {
        return String.format("Course Information"
                + "\n--------------------"
                + "\nTitle%14s%s"
                + "\nNumber%13s%s"
                + "\nSection%12s%s"
                + "\nSemester%11s%s"
                + "\nYear%15s%s"
                + "\nPrerequisite"
                + "\nStudent Grade Table"
                + "\n--------------------------------------------------------------------------------------------------------------"
                + "\nID Number\tStudent Name\tA1\tA2\tA3\tA4\tA5\tA6\tA7\tA8\tfin\tgrd"
                + "\n--------------------------------------------------------------------------------------------------------------",
                 ":", name, ":", number, ":", section, ":", semester, ":", year);
    }

}
