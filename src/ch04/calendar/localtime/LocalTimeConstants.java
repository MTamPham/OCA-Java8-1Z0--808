package ch04.calendar.localtime;

import java.time.LocalTime;

/*
 * We can use constants from the LocalTime class to work with predefined times:
 * - LocalTime.MIN - Minimum supported time, that is, 00:00
 * - LocalTime.MAX - Maximum supported time, that is, 23:59:59.999999999
 * - LocalTime.MIDNIGHT - Time when the day starts, that is, 00:00
 * - LocalTime.NOON - Noontime, that is, 12:00
 */
public class LocalTimeConstants {
    public static void main(String[] args) {
        System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT)); // prints true
    }
}
