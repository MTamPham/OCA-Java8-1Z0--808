package ch04.calendar.localdate;

import java.time.LocalDate;

/*
 * The LocalDate class defines methods with the names minusXX(), plusXX(), and withXX() to manipulate the date values.
 * Because LocalDate is an immutable class, all the methods create and return a copy.
 */
public class ManipulateLocalDate {
    public static void main(String[] args) {
        // The minusXX() methods return a copy of the date with the specified days, months, or years subtracted from it
        LocalDate bday = LocalDate.of(2052, 03, 20);
        System.out.println(bday.minusDays(10)); // prints 2052-03-10
        System.out.println(bday.minusMonths(2)); // prints 2052-01-20
        System.out.println(bday.minusWeeks(30)); // prints 2051-08-23
        System.out.println(bday.minusYears(1)); // prints 2051-03-20

        // The plusXX() methods return a copy of the day instance after adding the specified days, months, or years to it
        LocalDate launchCompany = LocalDate.of(2016, 02, 29);
        System.out.println(launchCompany.plusDays(1)); // prints 2016-03-01
        System.out.println(launchCompany.plusMonths(1)); // prints 2016-03-29
        System.out.println(launchCompany.plusWeeks(7)); // prints 2016-04-18
        System.out.println(launchCompany.plusYears(1)); // prints 2017-02-28

        // The withXX() methods return a copy of the date instance replacing the specified day, month, or year in it
        LocalDate firstJob = LocalDate.of(2036, 02, 28);
        System.out.println(firstJob.withDayOfMonth(1)); // prints 2026-02-28
        System.out.println(firstJob.withDayOfYear(1)); // prints 2026-01-01
        System.out.println(firstJob.withMonth(7)); // prints 2036-07-28
        System.out.println(firstJob.withYear(1)); // prints 0001-02-28
    }
}
