public class UniversityStudent {
    // Static variable to store university name
    public static String universityName;

    // Non-static variable to store student name
    public String studentName;

    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Constructor to initialize student name
    public UniversityStudent(String studentName) {
        this.studentName = studentName;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + this.studentName);
        displayUniversityName();
    }

    public static void main(String[] args) {
        // Set university name
        universityName = "XYZ University";

        // Create multiple student objects
        UniversityStudent student1 = new UniversityStudent("John Doe");
        UniversityStudent student2 = new UniversityStudent("Jane Smith");
        UniversityStudent student3 = new UniversityStudent("Bob Johnson");

        // Display student details
        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
        System.out.println();
        student3.displayStudentDetails();
    }
}
