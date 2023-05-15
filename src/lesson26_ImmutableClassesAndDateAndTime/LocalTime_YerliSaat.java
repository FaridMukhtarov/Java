package lesson26_ImmutableClassesAndDateAndTime;

import java.time.LocalTime;

public class LocalTime_YerliSaat {
    public static void main(String[] args) {

        // Yanliz saati Gosterir (LocalTime)

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 05:29:52.589845900 am

        LocalTime saat1 = LocalTime.of(15,10,20);
        System.out.println(saat.compareTo(saat1)); // -1

        System.out.println(saat1.withNano(64754)); // 15:10:20.000064754
    }
}
