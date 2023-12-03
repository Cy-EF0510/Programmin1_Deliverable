/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class Deliverable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course course = new Course("Programming 1", "420-101-VA", "0001 & 0002", "Fall", 2023);
        Student s1 = new Student("Cyril Efren Fabro", "efrencyril@gmail.com", "H3S 1H2"); 
        Student s2 = new Student("Nisha Patel", "blahblah@gmail.com", "H5S 1B4"); 
        System.out.println(course);
        System.out.println(s1);
        System.out.println(s2);
    }           
    
}
