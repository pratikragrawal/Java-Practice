import java.io.*;

public class SquareIntegersToFile {

    public static void main(String[] args) {
        String inputFilePath = "C:/Users/prati/OneDrive/Documents/java/input.txt";
        String outputFilePath = "C:/Users/prati/OneDrive/Documents/java/output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    try {
                        int number = Integer.parseInt(line);
                        int square = number * number;
                        writer.println(number + " " + square); // Write: original square
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
            }

            writer.flush(); // Ensure all content is written
        } catch (IOException e) {
            System.out.println("❌ Error during file read/write:");
            e.printStackTrace();
            return;
        }

        // ✅ Display contents of output.txt
        System.out.println("✅ Contents of output.txt:\n");

        try (
            BufferedReader outputReader = new BufferedReader(new FileReader(outputFilePath))
        ) {
            String outLine;
            while ((outLine = outputReader.readLine()) != null) {
                System.out.println(outLine);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading output.txt:");
            e.printStackTrace();
        }
    }
}
