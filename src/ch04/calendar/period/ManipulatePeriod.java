package ch04.calendar.period;

import java.time.LocalDate;
import java.time.Period;

/*
 * We can use the instance methods minusXX(long), plus(TemporalAmount), plusXX(long), minus(TemporalAmount), minusXX(long),
 * withXX() and multipliedBy(int) to create and return a copy of Period instances with the specified period added,
 * subtracted or modified. Period doesn't define divideBy() method.
 *
 * When we manipulate Period instances, the individual elements are returned. For example, if we add a period of one month
 * to a period of 15 days, it returns a period of 1 month and 15 days, not 45 days.
 *
 * Both the getXX() methods, minusXX() and plusXX() methods use the plural form getYears(), minusHours().
 */
public class ManipulatePeriod {
    public static void main(String[] args) {
        LocalDate bday = LocalDate.of(2021, 8, 7);
        LocalDate today = LocalDate.now();
        Period period10Days = Period.of(0, 0, 10);
        if (bday.minus(period10Days).isBefore(today)) {
            System.out.println("Time to send out reminders to friends");
        } else {
            System.out.println("It's still early to send out reminders to friends");
        }

        Period period1Month = Period.of(0, 1, 0);
        System.out.println(period10Days.minus(period1Month)); // prints P-1M10D
        System.out.println(period10Days.minusDays(5)); // prints P5D
        System.out.println(period10Days.minusMonths(5)); // prints P-5M10D
        System.out.println(period10Days.minusYears(5)); // prints P-5Y10D

        Period year1Month9Day20 = Period.of(1, 9, 20);
        System.out.println(year1Month9Day20.multipliedBy(2)); // prints P2Y18M40D
        System.out.println(year1Month9Day20.multipliedBy(-2)); // prints P-2Y-18M-40D

        Period period5Months = Period.of(0, 5, 0);
        Period period10Months = Period.of(0, 10, 0);
        System.out.println(period5Months.plus(period10Months)); // prints P15M
        System.out.println(period10Days.plusDays(35)); // prints P45D
        System.out.println(period10Days.plusMonths(5)); // prints P5M10D
        System.out.println(period10Days.plusYears(5)); // prints P5Y10D
    }
}
