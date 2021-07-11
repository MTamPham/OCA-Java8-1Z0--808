package ch04.calendar.localtime;

import java.time.LocalTime;

/*
 * LocalTime can be used to store times in the format hours-minutes-seconds (without a time zone) and to nanosecond
 * precision.
 *
 * Like LocalDate, LocalTime is also immutable and hence safe to be used in a multithreaded environment.
 *
 * The of() method uses a 24-hour clock to specify the hour value. If we pass out-of-range for hours, minutes, or seconds
 * to of(), we'll get a runtime exception, DateTimeException.
 *
 * The format of the string passed to parse() must be exactly of the format 99:99:99. The hours and minutes values passed
 * to parse() must be of two digits; a single digit is considered an invalid value.
 *
 * If we pass invalid values to parse() or of(), we'll get DateTimeException.
 */
public class CreateLocalTime {
    public static void main(String[] args) {
        // instantiate LocalTime instances using the method of()
        LocalTime timeHrsMin = LocalTime.of(12, 12);
        System.out.println("Time with hours and minutes: " + timeHrsMin.toString()); // prints 12:12
        LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
        System.out.println("Time with hours, minutes and seconds: " + timeHrsMinSec.toString()); // prints 00:12:06
        LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);
        System.out.println("Time with hours, minutes, seconds and nanoseconds: " + timeHrsMinSecNano.toString()); // prints 14:07:10.998654578
        // get the current time from the system clock using the static method now()
        LocalTime now = LocalTime.now();
        System.out.println("Now: " + now.toString());
        // parse a string in the format of 99:99:99 to instantiate a LocalTime instance
        LocalTime time = LocalTime.parse("15:08:23");
        System.out.println("Parsed time: " + time.toString());
    }
}
