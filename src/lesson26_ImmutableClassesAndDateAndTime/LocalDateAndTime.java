package lesson26_ImmutableClassesAndDateAndTime;

import java.time.LocalDateTime;

public class LocalDateAndTime {
    public static void main(String[] args) {

        // Tarix ve saati birlikde gosterir (LocalDateTime)

        LocalDateTime tarixSaat = LocalDateTime.now();
        System.out.println(tarixSaat); // 2023-01-13T05:35:12.473695200

        System.out.println(tarixSaat.getDayOfYear()); // 13
    }
}
