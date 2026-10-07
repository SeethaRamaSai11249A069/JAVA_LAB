import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // Calendar
        Calendar calendar = Calendar.getInstance();

        System.out.println("Using Calendar:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        // Gregorian Calendar
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        int year = gregorianCalendar.get(Calendar.YEAR);

        System.out.println("\nUsing Gregorian Calendar:");
        System.out.println("Year: " + year);
        System.out.println("Month: " +
                (gregorianCalendar.get(Calendar.MONTH) + 1));
        System.out.println("Day: " +
                gregorianCalendar.get(Calendar.DAY_OF_MONTH));

        // Check leap year
        if (gregorianCalendar.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}