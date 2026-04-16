// This class stores student details
class Student  {
    int studentId; // Student ID
    String name; // Student name
    String email; // Student email
    // Constructor to initialize student data
    Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }
    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "Prashansa Mishra", "prashansa@example.com");
        student.displayDetails();
    }
}