// Advanced/FileHandlingExample.java
import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            // Write to file
            FileWriter fw = new FileWriter(filename);
            fw.write("Hello Java File Handling\n");
            fw.write("This is a sample file.");
            fw.close();
            System.out.println("File written successfully.");

            // Read from file
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.println("Reading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
