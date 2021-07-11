package ch04.calendar.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/*
 * To format a date or time object, we can use either the instance format in date/time objects or the instance format
 * method in the DateTimeFormatter class
 */
public class FormatDateTimeObjectsUsingDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate date = LocalDate.of(2057, 8, 11);

        // format a date by using the format() method in the LocalDate, passing it a formatter
        System.out.println(date.format(formatter)); // prints August 11, 2057

        // format a date by using the format() method in the DateTimeFormatter, passing it a date
        System.out.println(formatter.format(date)); // prints August 11, 2057

        LocalTime time = LocalTime.of(14, 30, 15);
        // this code will throw an exception at runtime because the formatter defines rules to format a date object, buts
        // its format() is passed a time object
//        System.out.println(formatter.format(time));

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");

        System.out.println(d1.format(date)); // prints 2057
        System.out.println(d2.format(date)); // prints 2057
        System.out.println(d3.format(date)); // prints 2057 8 223
        System.out.println(d4.format(date)); // prints 7

        System.out.println(t1.format(time)); // prints 14 2 30 15
        System.out.println(t2.format(time)); // prints Time now:14 30 PM
    }
}
