package ch04.calendar.datetimeformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * To parse a date or time object, we can use either the static parse method in date/time objects or the instance parse
 * method in the DateTimeFormatter class.
 */
public class ParseDateTimeObjectsUsingDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2057-01-29", d1);
        System.out.println(date); //prints 2057-01-29

        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate date2 = LocalDate.parse("29-2057-01", d2);
        System.out.println(date2); // prints 2051-01-29

        // this code will throw a runtime exception because the parse mechanism works only if all components are present
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("yyyy");
        LocalDate date3 = LocalDate.parse("2057", d3);
    }
}
