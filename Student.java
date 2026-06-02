public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Create object using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        // Create object using parameterized constructor
        Student student2 = new Student("John Doe", 20);
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}

