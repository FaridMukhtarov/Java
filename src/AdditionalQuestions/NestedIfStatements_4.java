package AdditionalQuestions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NestedIfStatements_4 {
    public static void main(String[] args) {

        // İstifadəçidən günün adını daxil etməsini xahiş edin, əgər daxil edilmiş
        // gün iş günüdürsə, həftəsonu tətilinə qalan günlərin sayını “İndi tətil üçün
        // ... gün var indi islemek vaxtidir” şəklində çap edin, əgər daxil edilmiş gün həftə sonudursa,
        // "İndi istirahət etmək vaxtıdır" yaz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Günu daxil edin (format: yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ISO_DATE);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("Indi istirahet etmek vaxtidir");
        } else {
            long daysUntilWeekend = ChronoUnit.DAYS.between(date, getNextWeekendDate(date));
            System.out.println("Indi tətil üçün " + daysUntilWeekend + " gün var, indi işləmək vaxtıdır.");
        }
    }
    private static LocalDate getNextWeekendDate(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.FRIDAY) {
            return date.plusDays(2);
        } else if (dayOfWeek == DayOfWeek.SATURDAY) {
            return date.plusDays(1);
        } else {
            return date.plusDays(6 - dayOfWeek.getValue());
        }


    }
}
