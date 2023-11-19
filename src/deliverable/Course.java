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

    private static String name;
    private static int number;
    private static int section;
    private static int semester;
    private static int year;

    public Course() {
        this.name = name;
        this.number = number;
        this.section = section;
        this.semester = semester;
        this.year = year;
    }

    public Course(Course xxxxxx) {
        this.name = xxxxxx.name;
        this.number = xxxxxx.number;
        this.section = xxxxxx.section;
        this.semester = xxxxxx.semester;
        this.year = xxxxxx.year;
    }

    public Course(String n, int num, int sect, int sem, int y) {
        name = n;
        number = num;
        section = sect;
        semester = sem;
        year = y;
    }

    public static void setName(String name) {
        Course.name = name;
    }

    public static void setNumber(int number) {
        Course.number = number;
    }

    public static void setSection(int section) {
        Course.section = section;
    }

    public static void setSemester(int semester) {
        Course.semester = semester;
    }

    public static void setYear(int year) {
        Course.year = year;
    }

    public static String getName() {
        return name;
    }

    public static int getNumber() {
        return number;
    }

    public static int getSection() {
        return section;
    }

    public static int getSemester() {
        return semester;
    }

    public static int getYear() {
        return year;
    }

    public boolean equals(Object obj) { // not sure about the return type 
        boolean status = true;
        return status;
    }

    @Override
    public String toString() {
        return "Course{" + '}';
    }

}
