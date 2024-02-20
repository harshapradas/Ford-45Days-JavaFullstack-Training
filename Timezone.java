import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;

public class TimeZones {
    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

       
        ZoneId sourceZone = ZoneId.of("America/New_York");
        ZoneId targetZone = ZoneId.of("Asia/Kolkata");

        
        ZonedDateTime sourceDateTime = currentDate.atStartOfDay(sourceZone);
        System.out.println("Date and time in source time zone: " + sourceDateTime);

       
        ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(targetZone);
        System.out.println("Date and time in target time zone: " + targetDateTime);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String formattedDate = formatter.format(targetDateTime);
        System.out.println("Formatted date in target time zone: " + formattedDate);
    }
}
