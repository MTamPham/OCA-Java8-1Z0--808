package ch04.calendar.period;

import java.time.Period;

/*
 * The class Period defines getXX() method to query a Period on its years, months, and days. All these methods return an
 * int value.
 *
 * When we initialize a Period instance with days more than 31 days or months more than 12, it doesn't re-calculate its
 * years, months, or days components.
 *
 * We can check whether a period is zero by using the instance method isZero(). A Period instance is zero if all three
 * units are zero.
 *
 * We can check whether a period is negative by using the instance method isNegative(). It returns true if at least one
 * of its three components is strictly negative.
 */
public class QueryPeriod {
    public static void main(String[] args) {
        Period period = Period.of(2, 4, 40);
        System.out.println(period.getYears()); // prints 2
        System.out.println(period.getMonths()); // prints 4
        System.out.println(period.getDays()); // prints 40 because the Period class doesn't re-calculate

        Period period2 = Period.of(0, 0, 5);
        System.out.println(period2.isZero()); // prints false

        Period period3 = Period.of(0, 0, -5);
        System.out.println(period3.isNegative()); // prints true
    }
}
