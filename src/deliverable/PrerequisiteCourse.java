/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class PrerequisiteCourse extends Course {

    private Course[] prerequisites;
    private int numOfPrerequisites;
    private final int maxPrerequisites;

    public PrerequisiteCourse(Course[] prerequisites, int numOfPrerequisites, int maxPrerequisites, String name, String number, String section, String semester, int year) {
        super(name, number, section, semester, year);
        this.prerequisites = new Course[maxPrerequisites];
        this.numOfPrerequisites = 0;
        this.maxPrerequisites = maxPrerequisites;

    }

    public void addPrerequisiteCOurse() {
        if (numOfPrerequisites > maxPrerequisites) {
            System.out.println("The list is full");
        } else {
            numOfPrerequisites++;//?????????????????//
        }
    }

    public Course[] getPrerequisiteCoure(Course[] arrayCopy) {
        arrayCopy = prerequisites;
        return arrayCopy;
    }

    public String toString() {
        return "";
    }
}
