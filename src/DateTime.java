import java.time.*;
public class DateTime {
	public static void main(String args[]) {
		//shows the current Date and Time
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		Instant i = Instant.now();
		System.out.println(l);
		
		//shows current date
		LocalDate d = LocalDate.now();
		System.out.println(d);
//		LocalDate ld = LocalDate.of(2023,05,15); 
		LocalDate ld = LocalDate.of(2023,Month.JULY,15); 
		System.out.println(ld);
		
		//shows current Time
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		//if we want to get Zone
		for(String z : ZoneId.getAvailableZoneIds())
		{
			System.out.println(z);
		}

		LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Indian/Kerguelen"));
		System.out.println(ldt);
		
		//Method for LocalDate 
	         System.out.println( d.getYear());
	         System.out.println( d.getMonth());
	         System.out.println( d.getMonthValue());
	         System.out.println( d.getDayOfMonth());
	         System.out.println( d.getDayOfWeek());
	         System.out.println( d.getDayOfYear());
	         
	       //Method for and LocalTime
	         System.out.println(t.getHour());
	         System.out.println(t.getMinute());
	         System.out.println(t.getSecond());
	         
	}

}
