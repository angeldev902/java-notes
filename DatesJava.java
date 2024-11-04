import java.time.*;
import java.time.format.*;
public class DatesJava {
    public static void main(String[] ars) {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Before formating: "+currentDate);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = currentDate.format(myFormatObj);
        System.out.println("After formatting: "+formattedDate);
    }
}