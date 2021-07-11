package ch04.calendar.localdate;

import java.time.LocalDate;
import java.time.LocalTime;

/*
 * The LocalDate class defines methods to convert it to LocalDateTime and long (representing the epoch date).
 *
 * The LocalDate class defines overloaded atTime() instance methods. These methods combine LocalDate with time to create
 * and return LocalDateTime, which stores both the date and time.
 *
 * The method toEpochDay() converts LocalDate to the epoch date - the count of days from January 1, 1970.
 *
 * The method atTime() will throw a DateTimeException at runtime if we pass any invalid hours, minutes, or seconds to it.
 *
 * Note: In standard date and time, the epoch date refers to January 1, 1970 00:00:00 GMT.
 */
public class ConvertLocalDate {
    public static void main(String[] args) {
        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println(interviewDate.atTime(16, 30)); // prints 2016-02-28T16:30
        System.out.println(interviewDate.atTime(16,30, 20)); // prints 2016-02-28T16:30:20
        System.out.println(interviewDate.atTime(16, 30, 20, 300)); // prints 2016-02-28T16:30:20.000000300
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30))); // prints 2016-02-28T16:30

        LocalDate launchBook = LocalDate.of(2016, 2, 8);
        LocalDate aDate = LocalDate.of(1970, 1, 8);
        System.out.println(launchBook.toEpochDay()); // prints 16839
        System.out.println(aDate.toEpochDay()); // prints 7
    }
}
