package example05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        
        // Datetime to String

        // LocalDateTime currentDateTime = LocalDateTime.now();
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		// String formatted = currentDateTime.format(formatter);

		// System.out.println("Formatted date time: " + formatted);

        // String to Datetime

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse("20/11/2020 19:30:25", formatter);

		System.out.println("Date time: " + dateTime);

    }
    
}
