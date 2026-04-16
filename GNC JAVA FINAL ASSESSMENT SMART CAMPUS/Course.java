// This class stores course details 
class Course {
    int courseId; // Course ID
    String courseName; // Course name
    double fees; // Course fees
    // Constructor to initialize course data
    Course (int courseId, String courseName, double fees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fees = fees;
    }
    // Method to display course details
    void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Fees: " + fees);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Course course = new Course(101, "Java Programming", 5000.0);
        course.displayDetails();
    }
}