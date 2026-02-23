// MEHMET SOYDAN DATA STORAGE WORK

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

    // Output log file where all Owner and Client entries are stored
    private static final String FILE_NAME = "vehicular_cloud_log.txt";


    public static void saveUser(User user) {
        // 'true' enables append mode — critical for supporting multiple entries (requirement c)
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(user.fileText()); // writes formatted user data as a single line
            writer.println();               // blank line between entries for readability
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
