import java.util.Calendar;
import java.util.GregorianCalendar;

public class C8E5GregorianCalendar {

	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		// Displaying current yy,mm & dd
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("DAY_OF_MONTH: "
				+ calendar.get(Calendar.DAY_OF_MONTH));
		// Displaying since January 1, 1970
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("DAY_OF_MONTH: "
				+ calendar.get(Calendar.DAY_OF_MONTH));
	}
}
