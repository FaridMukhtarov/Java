package lesson26_ImmutableClassesAndDateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodOf_DogumdanBuGune {
    public static void main(String[] args) {

        LocalDate gunumuz = LocalDate.now();
        LocalDate dogumGunum = LocalDate.of(1995,01,01);

        Period kecenGun = Period.between(dogumGunum,gunumuz);
        System.out.println(kecenGun); // P28Y12D

        System.out.println(kecenGun.getYears()); // 28
    }
}
