package AdditionalQuestions;

import java.util.Scanner;

public class IfElseeifStatementsQuestion_2 {
    public static void main(String[] args) {

        // İstifadəçinin çəkisini (kq) və boyunu (sm) soruşun
        // və bədən kütləsi indeksi 30-dan çox piylənmə,
        // 25-30 kilolu, 20-25 normal olduqda bədən kütləsi
        // indeksini (ceki*10000 / (boy *boy) hesablayın.
        // , 20 -dən azdırsa, zəif çap edin.

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa cekinisi kq olaraq daxil edin: ");
        double ceki = input.nextDouble();

        System.out.print("Zehmet olmasa boyunuzu sm olaraq daxil edin: ");
        double boy = input.nextDouble();

        double hesablama = (ceki * 10000 / (boy * boy));

        if (hesablama > 30) {
            System.out.println("Piylənmə: " + hesablama);
        } else if (hesablama > 25) {
            System.out.println("Kilolu: " + hesablama);
        } else if (hesablama > 20) {
            System.out.println("Normal: " + hesablama);
        } else
            System.out.println("Zəif: " + hesablama);
    }
}
