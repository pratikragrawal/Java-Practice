import java.io.*;
import java.util.Scanner;

public class FileIOIntegers {

    public static void main(String[] args) {
        String inputFilePath = "C:/Users/prati/OneDrive/Documents/java/input.txt";
        String outputFilePath = "C:/Users/prati/OneDrive/Documents/java/output.txt";

        try (
            Scanner scanner = new Scanner(new File(inputFilePath));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath));
        ) {
            System.out.println("Reading integers from input.txt and writing to output.txt...\n");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    writer.println(number);  // Write integer to output.txt
                } else {
                    scanner.next(); // Skip non-integer input
                }
            }

            writer.flush(); // Ensure everything is written
        } catch (IOException e) {
            System.out.println("❌ Error during file read/write:");
            e.printStackTrace();
            return;
        }

        // Display contents of output.txt
        System.out.println("Contents of output.txt:\n");
        try (
            BufferedReader reader = new BufferedReader(new FileReader(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Equivalent to C++ cout
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading output.txt:");
            e.printStackTrace();
        }
    }
}

