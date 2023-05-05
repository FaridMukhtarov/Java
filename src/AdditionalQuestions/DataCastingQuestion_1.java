package AdditionalQuestions;

import java.util.Scanner;

public class DataCastingQuestion_1 {
    public static void main(String[] args) {

        // int kimi daxil edilmiş 3 dəyərin ortasını double olaraq çap edən kod yazın

        int a, b, c;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        ortalama = (a + b + c) / 3.0;
        System.out.println("The average of the three numbers is: " + ortalama);
    }
}
