package ch04.calendar.datetimeformatter;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * Defined in the package java.time.format, the class DateTimeFormatter can be used to format or parse date and time
 * objects.
 *
 * There are multiple ways to instantiate or access a DateTimeFormatter:
 * - By calling a static ofXX() method, passing it a FormatStyle value
 * - By access public static fields of DateTimeFormatter
 * - By using the static method ofPattern() and passing it a string value
 *
 * Note that the ofLocalizedDate(), ofLocalizedTime(), and ofLocalizedDateTime() format date and time objects according
 * to the locale (language, region, or country) of the system on which the code executes.
 */
public class CreateDateTimeFormatter {
    public static void main(String[] args) {
        // instantiate a DateTimeFormatter by calling ofXX() static method
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
        // access a DateTimeFormatter by using the public and static fields of the class
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
        // instantiate a DateTimeFormatter using a pattern of letters and symbols
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy MM dd");
    }
}
