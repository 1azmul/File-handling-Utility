package FileUtitlity;
import java.io.FileReader; // Importing FileReader to read file character by character
import java.io.BufferedReader; // Importing BufferedReader for efficient reading of text files
import java.io.IOException; // Importing IOException to handle input/output errors

public class FileReading {
    public static void main(String[] args) {
        // Using try-with-resources to ensure proper resource management
        try (FileReader reader = new FileReader("CodeTechFile.txt"); // Initialize FileReader to read the file
             BufferedReader bufferedReader = new BufferedReader(reader)) { // Wrap FileReader with BufferedReader for line-by-line reading

            String line; // Variable to store each line of text
            // Loop through each line of the file until the end is reached
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print the content of the current line
            }

        } catch (IOException e) { // Catch any IO-related exceptions
            e.printStackTrace(); // Print the stack trace for debugging purposes
        }
    }
}

