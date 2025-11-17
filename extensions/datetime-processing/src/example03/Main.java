package example03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Datetime to String
        
        // Date currentDateTime = new Date();
		// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// String formatted = formatter.format(currentDateTime);
		
		// System.out.println("Formatted date time: " + formatted);

        // String to Datetime

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dateTime = null;
		try {
			dateTime = formatter.parse("20/11/2020 19:30:25");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Date time: " + dateTime);

    }
    
}
