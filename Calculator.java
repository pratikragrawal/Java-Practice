public class Calculator {
    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to add two doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to add three integers
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        // Create object of Calculator
        Calculator calculator = new Calculator();

        // Demonstrate adding two integers
        int result1 = calculator.add(10, 20);
        System.out.println("Result 1: " + result1);

        // Demonstrate adding two doubles
        double result2 = calculator.add(10.5, 20.7);
        System.out.println("Result 2: " + result2);

        // Demonstrate adding three integers
        int result3 = calculator.add(10, 20, 30);
        System.out.println("Result 3: " + result3);
    }
}

