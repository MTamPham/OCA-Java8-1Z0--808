package ch04.calendar.period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/*
 * Period can be used to store amounts of date in years, months, and days, like 2 years, 5 months, and 10 days. The Period
 * class is also immutable and hence safe to use in multithreaded environment.
 *
 * With a private constructor, the Period class defines multiple factory methods to create its instances. The static
 * methods of(), ofYears(), ofMonths(), ofWeeks(), and ofDays() accept int values to create periods of years, months,
 * weeks, or days. We can also define negative periods by passing negative integer values to all the preceding methods.
 * The period element values don't combine to each other. Its individual elements, that is, days, moths, and years, are
 * stored the way it is initialized. For example, a Period of 35 days is not stored as 1 month and 5 days.
 *
 * The the string passed to parse() should be in the format PnYnMnD or PnW, where n represents a number and the letters
 * (P, Y, M, D, and W) represent parse, year, month, day, and week. These letters can exist in lower- or uppercase.
 * But each string must start with the letter p or P and must include at least one of the four section, that is, year,
 * month, week, or day. For the string format PnW, the count of weeks is multiplied by 7 to get the number of days.
 * If a negative sign (-) is precedent the complete string value passed to the parse(), it applies to all values.
 * If a negative sign is placed just before an individual number, it applies only to that section.
 *
 * The static method between() accepts two LocalDate instances and returns a Period instance representing the number of
 * years, days, and months between the two dates. The first date is included, but the second date is excluded in the
 * returned Period i.e. period = end date - start date.
 */
public class CreatePeriod {
    public static void main(String[] args) {
        // instantiate LocalDate instances using the method of(), ofYears(), ofMonths(), ofWeeks(), and ofDays()
        Period period1 = Period.of(1, 2, 7); // 1 year, 2 months, and 7 days
        Period period2 = Period.ofYears(2); // 2 years
        Period period3 = Period.ofMonths(5); // 5 months
        Period period4 = Period.ofWeeks(10); // 10 weeks
        Period period5 = Period.ofDays(15); // 15 days
        Period period6 = Period.ofDays(-15); // period of -15 days
        // parse a string to instantiate Period
        Period p5Yrs1 = Period.parse("P5y"); // period of 5 years
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");
        System.out.println(p5Yrs1 + ":" + p5Yrs2); // prints P5Y:P5Y
        System.out.println(p5Yrs4 + ":" + p5Yrs6); // prints P5Y:P5Y
        Period p5Yrs7 = Period.parse("P5y1m2d");
        System.out.println(p5Yrs7); // prints P5Y1M2D
        Period p9Mths = Period.parse("p9m");
        System.out.println(p9Mths); // prints P9M
        Period p60Days = Period.parse("P60d");
        System.out.println(p60Days); // prints P60D
        Period pMinus5Wks = Period.parse("-P5W");
        System.out.println(pMinus5Wks); // prints P-35D
        // use between() to instantiate Period
        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
        Period periodBetween = Period.between(carnivalStart, carnivalEnd);
        System.out.println(periodBetween); // prints P2D
    }
}
