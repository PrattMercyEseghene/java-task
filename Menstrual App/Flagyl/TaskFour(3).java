import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TaskFour {


    public static void main(String[] args) {
        long millis = System.currentTimeMillis();

        Instant instant = Instant.ofEpochMilli(millis);

        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");

        String formattedDate = dateTime.format(formatter);

        System.out.println("Current date and time is " + formattedDate);
    }
}
