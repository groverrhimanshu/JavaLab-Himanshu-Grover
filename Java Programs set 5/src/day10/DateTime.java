package day10;
import java.time.LocalDate;
import java.time.LocalTime;


public class DateTime {

	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
	}

}
