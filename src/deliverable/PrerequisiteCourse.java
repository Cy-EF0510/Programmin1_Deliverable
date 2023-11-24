/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class PrerequisiteCourse extends Course{
    private Course[] prerequisites;
    private int numOfPrerequisites;
    private int maxPrerequisites;

    public PrerequisiteCourse(Course[] prerequisites, int numOfPrerequisites, int maxPrerequisites) {
        super(name, number, secion, semester, year);
        this.prerequisites = new Course[maxPrerequisites];
        this.numOfPrerequisites = 0;
        this.maxPrerequisites = maxPrerequisites;
        
    }
    
    public void addPrerequisiteCOurse(){
        if(numOfPrerequisites > maxPrerequisites){
            System.out.println("The list is full");
        }
        else {
            prerequisites[numOfPrerequisites] = course;
            numOfPrerequisites++;
        }
    }
    
    public Course[] getPrerequisiteCoure(){
        
        return courseCopy.copyOf(prerequisites, numOfPrerequisites);;
    }
    
    public String toString(){
        return "";
    }
}
