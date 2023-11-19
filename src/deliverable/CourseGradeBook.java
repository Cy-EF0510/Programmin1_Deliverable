/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

/**
 *
 * @author Cyril
 */
public class CourseGradeBook {

    private String[] caNames;
    private double[] caWights;
    private Course course;
    private StudentGradesRecord[] gradeList;
    private int gradesRecord;

    public CourseGradeBook(Course course) {

    }

    public double addGradeRecord(Student student, double[] grades) { //not sure about the return type;
        return 1;
    }

    public double findArraySum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public double findArrayMaximum(double[] numbers) {
        double max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public double findArrayMinimum(double[] numbers) {
        double min = 100;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public double findArrayAverage(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = sum / numbers.length;
        return avg;
    }

    public double findArrayStandardDev(double[] numbers) {
        double sum = 0;
        double stDev = 0;
        double mean;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        mean = sum / numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            stDev = stDev + Math.pow((numbers.length - mean), 2);
        }
        return Math.sqrt(stDev / numbers.length);
    }

    public double copmputeTotalWeight() {
        return 1;
    }

    public double[] getFinalsArray() { // Bro what is this 
        return 1;
    }

    public double[] getAssessmentArray(int k) {
        return 1;
    }

    public double findMaxAssessment(int k) {
        return 1;
    }

    public double findMinAssessment(int k) {
        return 1;
    }

    public double findAvgAssessment(int k) {
        return 1;
    }

    public double findStdevAssessment(int k) {
        return 1;
    }

    public String toStringMaxAssessment() {
        return "";
    }

    public String toStringMinAssessment() {
        return "";
    }

    public String toStringAvgAssessment() {
        return "";
    }

    public String toStringStdevAssessment() {
        return "";
    }
}
