package java8_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import static java.time.LocalDate.*;

public class Test1 {

	public static void main(String[] args) {
//		Date d1=new Date();
//		System.out.println(d1);
		// display current date
		LocalDate today=LocalDate.EPOCH;
		System.out.println("date "+today);
		
		//display curnt time
		LocalTime time=LocalTime.NOON;
		System.out.println("curnt time "+time);
		
		//display time stamp(date+time)
		LocalDateTime timeStamp=LocalDateTime.now();
		System.out.println("curnt TS "+timeStamp);
				

	}

}
