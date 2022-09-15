package homeworkDateAndTimeMultithreading;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class MainDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
        System.out.println(today.getDayOfMonth());

        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(today.minusYears(3));

    }
}
