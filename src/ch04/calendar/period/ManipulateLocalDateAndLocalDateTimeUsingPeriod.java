package ch04.calendar.period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/*
 * The Period class implements the interface TemporalAmount, so it can be used with the method plus() and minus()
 * defined in the classes LocalDateTime and LocalDate.
 */
public class ManipulateLocalDateAndLocalDateTimeUsingPeriod {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2052, 01, 31);
        System.out.println(date.plus(Period.ofDays(1))); // prints 2052-02-01
        System.out.println(date.minus(Period.ofWeeks(4))); // prints 2052-01-03

        LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
        System.out.println(dateTime.plus(Period.ofMonths(1))); // prints 2052-02-29T14:18:36 because the last day on Feb 2052 is 29th
        System.out.println(dateTime.minus(Period.ofYears(2))); // prints 2050-01-31T14:18:36

        LocalDateTime dateTime2 = LocalDateTime.parse("2051-01-31T14:18:36");
        System.out.println(dateTime2.plus(Period.ofMonths(1))); // prints 2051-02-28T14:18:36 because the last day on Feb 2051 is 28th
    }
}
