import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; //! Must import DateTimeFormatter for custom formatting

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current DateTime: " + dateTime);

        //* Custom Formatting using DateTimeFormatter
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fmtDateTime = dateTime.format(fmt);
        System.out.println("Formatted DateTime: " + fmtDateTime);

        //* format symbols:
        //* dd : Day of month (2 digits)
        //* MM : Month of year (2 digits)
        //* yyyy : Year (4 digits)
        //* HH : Hour of day (00-23)
        //* mm : Minute of hour (2 digits)
        //* ss : Second of minute (2 digits)
        //* EEEE : Day name in week
        //* MMMM : Month name in year
    }
}