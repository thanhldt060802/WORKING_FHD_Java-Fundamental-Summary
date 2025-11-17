package example04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        
        LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		LocalDateTime currentDateTime = LocalDateTime.now();

		System.out.println("Current date: " + currentDate);
		System.out.println("Current time: " + currentTime);
		System.out.println("Current date time: " + currentDateTime);

		System.out.println();

		LocalDate customDate = LocalDate.of(2025, 10, 20);
		LocalTime customTime = LocalTime.of(16, 30, 55);
		LocalDateTime customDateTime = LocalDateTime.of(2020, 11, 20, 19, 25, 30);

		System.out.println("Custom date: " + customDate);
		System.out.println("Custom time: " + customTime);
		System.out.println("Custom date time: " + customDateTime);

    }
    
}
