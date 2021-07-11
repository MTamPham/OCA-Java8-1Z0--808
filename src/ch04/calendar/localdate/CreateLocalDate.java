package ch04.calendar.localdate;

import java.time.LocalDate;
import java.time.Month;

/*
 * LocalDate can be used to store dates without time or time zones. LocalDate instances are immutable and hence safe to
 * be used in a multithreaded environment.
 *
 * The LocalDate constructor is marked private, so we must use one of the factory methods to instantiate it.
 *
 * The format of the string passed to parse() must be exactly of the format 9999-99-99. The month and date values passed
 * to parse() must be of two digits; a single digit is considered an invalid value.
 *
 * If we pass invalid values to parse() or of(), we'll get DateTimeParseException.
 */
public class CreateLocalDate {
    public static void main(String[] args) {
        // instantiate LocalDate instances using the method of()
        LocalDate date1 = LocalDate.of(2021, 07, 07); // accept month as int value
        System.out.println("Date 1: " + date1.toString());
        LocalDate date2 = LocalDate.of(2021, Month.JULY, 07); // accept month as enum constant
        System.out.println("Date 2: " + date2.toString());
        // get the current date from the system clock using the static method now()
        LocalDate date3 = LocalDate.now();
        System.out.println("Date 3: " + date3.toString());
        // parse a string in the format 9999-99-99 to instantiate LocalDate
        LocalDate date4 = LocalDate.parse("2025-08-09");
        System.out.println("Date 4: " + date4.toString());
    }
}
