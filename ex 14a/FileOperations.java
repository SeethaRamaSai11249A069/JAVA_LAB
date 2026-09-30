import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        try {
            // Open/Create the file
            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File opened successfully.");
            }

            // Write data into the file
            FileWriter writer = new FileWriter(file);
            writer.write("Name: Rahul\n");
            writer.write("Roll No: 101\n");
            writer.write("Course: Java");
            writer.close();

            System.out.println("Data written successfully.");

            // Read data from the file
            Scanner sc = new Scanner(file);

            System.out.println("\nFile Contents:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}