package ch04.calendar.localtime;

import java.time.LocalTime;

/*
 * We can use instance methods like getXX() to query LocalTime on its hours, minutes, seconds, and nanoseconds. All these
 * methods return an int value. Note that the XX is in singular form such as getHour(), getMinute(), getSecond() and
 * getNano().
 *
 * The other instance methods isAfter() or isBefore() can be used to determine whether a time is after or before
 * the specified time.
 */
public class QueryLocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 20, 12, 98547);
        System.out.println(time.getHour()); // prints 16
        System.out.println(time.getMinute()); // prints 20
        System.out.println(time.getSecond()); // prints 12
        System.out.println(time.getNano()); // prints 98547

        LocalTime tamFinishTime = LocalTime.parse("18:00:00");
        LocalTime trangFinishTime = LocalTime.parse("20:00:00");
        if (tamFinishTime.isBefore(trangFinishTime)) {
            System.out.println("Tam finishes working earlier");
        } else {
            System.out.println("Tam finishes working later");
        }
    }
}
