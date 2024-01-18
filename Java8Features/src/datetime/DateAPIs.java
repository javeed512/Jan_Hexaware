package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAPIs {

	public static void main(String[] args) {


			LocalDate date1 =	LocalDate.now();
			
			LocalDate date2 =	LocalDate.of(2023,12,31);
			
			
			System.out.println(date1.isLeapYear());
			
			System.out.println(date1.isBefore(date2));
			
			System.out.println(date1.plusYears(20));
			
			System.out.println(date1.minusYears(20));
			
			System.out.println(date1.withYear(1947));
			
			System.out.println(date1.getYear());
			
			System.out.println(date2.getDayOfYear());
			
		

	}

}
