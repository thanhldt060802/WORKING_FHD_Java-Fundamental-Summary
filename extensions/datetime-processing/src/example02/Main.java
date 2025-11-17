package example02;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        
        Calendar currentCalendar = Calendar.getInstance();
		System.out.println("Year: " + currentCalendar.get(Calendar.YEAR));
		System.out.println("Month: " + (currentCalendar.get(Calendar.MONTH) + 1));  // Tháng bắt đầu từ 0
		System.out.println("Day of month: " + currentCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: " + currentCalendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hour of day: " + currentCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: " + currentCalendar.get(Calendar.MINUTE));
		System.out.println("Second: " + currentCalendar.get(Calendar.SECOND));
		
		System.out.println();
		
		Calendar customCalendar = Calendar.getInstance();
		customCalendar.set(2024, 11, 20, 17, 30, 45);
		System.out.println("Year: " + customCalendar.get(Calendar.YEAR));
		System.out.println("Month: " + (customCalendar.get(Calendar.MONTH) + 1));
		System.out.println("Day of month: " + customCalendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Day of week: " + customCalendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hour of day: " + customCalendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute: " + customCalendar.get(Calendar.MINUTE));
		System.out.println("Second: " + customCalendar.get(Calendar.SECOND));

    }
    
}
