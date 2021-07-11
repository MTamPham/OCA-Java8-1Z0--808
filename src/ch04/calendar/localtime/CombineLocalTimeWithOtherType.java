package ch04.calendar.localtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * The LocalTime class defines the atDate() method to combine a LocalDate with itself to create LocalDateTime.
 */
public class CombineLocalTimeWithOtherType {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 10, 0);
        LocalDate date = LocalDate.of(2016, 02, 28);
        LocalDateTime dateTime = time.atDate(date);
        System.out.println(dateTime); // prints 2016-02-28T14:10
    }
}
