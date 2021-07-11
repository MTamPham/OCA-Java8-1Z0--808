package ch04.calendar.localdatetime;

import java.time.LocalDateTime;

/*
 * LocalDateTime can be used to store both date and time (without the time zone). It stores a value like
 * 2050-06-18T14:20:30:908765 (year-month-dayThours:minutes:seconds:nanoseconds).
 *
 * The LocalDateTime class uses the letter T to separate date and time values in its printed value.
 *
 * The class defines similar methods as those defined by the LocalDate and LocalTime classes.
 */
public class CreateLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();

        if (prizeCeremony.getMonthValue() == 6) {
            System.out.println("Can't invite president");
        } else {
            System.out.println("President invited");
        }

        LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");

        if (prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture)) {
            System.out.println("Chief Guest will leave before ceremony completes");
        }

        LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
        if (eventMgrArrival.isAfter(prizeCeremony.minusHours(3))) {
            System.out.println("Manager is supposed to arrive 3 hours earlier");
        }
    }
}
