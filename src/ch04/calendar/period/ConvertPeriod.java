package ch04.calendar.period;

import java.time.Period;

/*
 * The method toTotalMonths() returns the total number of months in the period by multiplying the number of years by 12
 * and adding the number of months.
 */
public class ConvertPeriod {
    public static void main(String[] args) {
        System.out.println(Period.of(10, 5, 40).toTotalMonths()); // prints 125
    }
}
