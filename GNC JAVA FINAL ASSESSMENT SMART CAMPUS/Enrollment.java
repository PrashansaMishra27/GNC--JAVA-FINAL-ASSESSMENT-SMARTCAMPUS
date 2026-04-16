import java.util.*;
// This class handles student enrollment in courses 
class Enrollment {
    // HashMap to store student enrollments, where key is student ID and value is a list of course IDs
    HashMap<Integer, ArrayList<Integer>> enrollments = new HashMap<>();
    // Method to enroll a student in a course
    void enroll(int studentId, int courseId) {
        // if student is not present, create a new list 
        enrollments.putIfAbsent(studentId, new ArrayList<>());
        // Add the course ID to the student's enrollment list
        enrollments.get(studentId).add(courseId);
    }
    // Method to display enrollments for a student
    void display() {
        for (int sid : enrollments.keySet()) {
            System.out.println("Student " + sid + "->" + enrollments.get(sid));

        }
    }
    
    // Main method to test the Enrollment class
    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        enrollment.enroll(101, 201);
        enrollment.enroll(101, 202);
        enrollment.enroll(102, 201);
            enrollment.display();
        }
    }
