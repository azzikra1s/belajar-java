import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
//* You can use LocalDateTime to get both date and time information
//* Or import LocalDate and LocalTime separately if needed for more specific use cases

public class Exercise2 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime.getDayOfWeek());    // * Day name
        System.out.println(currentDateTime.getDayOfMonth());   // * Day number
        System.out.println(currentDateTime.getMonth());        // * Month name
        System.out.println(currentDateTime.getYear());         // * Year
        
        System.out.println(currentDateTime.getHour());         // * Hour
        System.out.println(currentDateTime.getMinute());       // * Minute
        System.out.println(currentDateTime.getSecond());       // * Second

        // Use Formatters for custom date-time representation
        DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
        DateTimeFormatter fmtTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter fmtTime12 = DateTimeFormatter.ofPattern("hh:mm a");
        
        String formattedDate = currentDateTime.format(fmtDate);
        String formattedTime = currentDateTime.format(fmtTime);
        String formattedTime12 = currentDateTime.format(fmtTime12);

        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);
        System.out.println("Formatted Time (12-hour): " + formattedTime12);

    }
}