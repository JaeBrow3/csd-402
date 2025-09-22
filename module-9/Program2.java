// Program2.java
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        Path path = Paths.get("data.file");
        Random rand = new Random();

        // Write or append 10 random integers separated by spaces
        try (BufferedWriter writer = Files.newBufferedWriter(
                path,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        )) {
            // If file already has content, add a newline so we keep each run on its own line
            if (Files.size(path) > 0) {
                writer.newLine();
            }

            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(100); 
                writer.write(Integer.toString(n));
                if (i < 9) writer.write(' ');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Failed to write numbers: " + e.getMessage());
            return;
        }

        try {
            String contents = Files.readString(path, StandardCharsets.UTF_8);
            System.out.println("Contents of data.file:");
            System.out.println(contents);
        } catch (IOException e) {
            System.out.println("Failed to read file: " + e.getMessage());
        }
    }
}

