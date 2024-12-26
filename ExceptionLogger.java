import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionLogger {
    private static final String LOG_FILE = "exceptions.log";

    public static void log(Exception e) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            bw.write(e.toString());
            bw.newLine();
        } catch (IOException ioException) {
            System.out.println("Ошибка при записи лога: " + ioException.getMessage());
        }
    }
}
