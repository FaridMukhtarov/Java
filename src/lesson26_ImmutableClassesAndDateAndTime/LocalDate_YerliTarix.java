package lesson26_ImmutableClassesAndDateAndTime;

import java.time.LocalDate;

public class LocalDate_YerliTarix {
    public static void main(String[] args) {

        // Yanliz Tarixi Gozterir (LocalDate)

        LocalDate tarix = LocalDate.now();
        System.out.println(tarix); // 2023-01-13

        System.out.println(tarix.minusDays(3)); // 2023-01-10
        System.out.println(tarix.minusMonths(1).minusDays(3)); // 2022-12-10

        System.out.println(tarix.plusMonths(1)
                .plusWeeks(1)
                .minusDays(3)); // 2023-02-17

        System.out.println(tarix.getMonthValue()); // 1
        System.out.println(tarix.getMonth()); // JANUARY
        System.out.println(tarix.getDayOfWeek()); // FRIDAY
        System.out.println(tarix.getDayOfYear()); // 13

        System.out.println(tarix.isLeapYear()); // false

        System.out.println(tarix.lengthOfYear()); // 365

        System.out.println(tarix.withYear(1995).withMonth(1).withDayOfMonth(1).getDayOfWeek());  // SUNDAY

        LocalDate tarix1 = LocalDate.of(2011,11,11);
        LocalDate tarix2 = LocalDate.of(2010,10,10);

        System.out.println(tarix2.isBefore(tarix1)); // true
        System.out.println(tarix2.isAfter(tarix1)); // false

        System.out.println(tarix1.equals(tarix2)); // false
    }
}
