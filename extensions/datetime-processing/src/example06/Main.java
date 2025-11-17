package example06;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        
        LocalDate startDate = LocalDate.of(2021, 1, 1);
		LocalDate endDate = LocalDate.of(2022, 2, 15);
		Period period = Period.between(startDate, endDate);
		System.out.println("Period: " + period.getYears() + " years, " + period.getMonths() + " months, "
				+ period.getDays() + " days");

		System.out.println();

		LocalTime startTime = LocalTime.of(12, 30, 30);
		LocalTime endTime = LocalTime.of(20, 0, 0);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Duration: " + duration.toHours() + " hours, " + duration.toMinutesPart() + " minutes, "
				+ duration.toSecondsPart() + " seconds");

    }
    
}
