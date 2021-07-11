package ch04.calendar.localtime;

import java.time.LocalTime;

/*
 * The LocalTime class defines methods with the names minusXX(), plusXX(), and withXX() to manipulate the time values.
 * Because LocalTime is an immutable class, all the methods create and return a copy.
 *
 * Unlike querying LocalTime, manipulating LocalTime methods use the plural form such as minusHours(), minusMinutes(),
 * minusSeconds(), minusNanos()
 */
public class ManipulateLocalTime {
    public static void main(String[] args) {
        // The minusXX() methods create and return a copy of LocalTime instances with the specified period subtracted
        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime tamStartTime = movieStartTime.minusMinutes(35);
        System.out.println("Start by " + tamStartTime + " from office"); // prints Start by 20:25 from office

        // The plusXX() methods create and return a copy of LocalTime instances with the specified period added
        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime)) {
            System.out.println("New world record");
        } else {
            System.out.println("Try harder");
        }

        // The withXX() methods return a copy of LocalTime instance with the specified value altered
        LocalTime startTime = LocalTime.of(5, 7, 9);
        if (startTime.getMinute() < 30) {
            startTime = startTime.withMinute(0);
        }
        System.out.println(startTime); // prints 05:00:09
    }
}
