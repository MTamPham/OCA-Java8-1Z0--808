package ch04.calendar.localdate;

import java.time.LocalDate;

/*
 * We can use instance methods like getXX() to query LocalDate on its year, month, and date values. The date can be
 * queried as day-of-month, day-of-week, and day-of-year. The month value can be retrieved as the enum constant Month or
 * as an int value.
 *
 * The other instance methods isAfter() or isBefore() can be used to determine whether a date is chronologically before
 * or after another date.
 */
public class QueryLocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth()); // prints 30
        System.out.println(date.getDayOfWeek()); // prints SUNDAY
        System.out.println(date.getDayOfYear()); // prints 243
        System.out.println(date.getMonth()); // prints AUGUST
        System.out.println(date.getMonthValue()); // prints 8
        System.out.println(date.getYear()); // prints 2020

        LocalDate tamBday = LocalDate.parse("1992-08-07");
        LocalDate trangBday = LocalDate.parse("1991-02-19");
        System.out.println(tamBday.isAfter(trangBday)); // prints true
        System.out.println(tamBday.isBefore(trangBday)); // prints false
        System.out.println(tamBday.isBefore(tamBday)); // prints false
    }
}
