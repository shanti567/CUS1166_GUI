// MEHMET SOYDAN DATA STORAGE WORK

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

    private static final String FILE_NAME = "vehicular_cloud_log.txt";

    public static void saveUser(User user) {
        // true = append mode so multiple entries are preserved
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(user.fileText());
            writer.println(); // blank line between entries for easier understanding of lines
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
