package AdditionalQuestions;

import java.util.Scanner;

public class ModulusQuestion {
    public static void main(String[] args) {

        // İstifadəçidən 4 rəqəmli müsbət tam ədəd götürək və rəqəmlərin cəmini tapaq

        Scanner scanner = new Scanner(System.in);
        System.out.print("4 rəqəmli müsbət tam ədəd daxil edin: ");
        int number = scanner.nextInt();

        // Rəqəmlərin cəmini hesablayaq
        int sum = 0;
        int digit;
        digit = number % 10;
        sum += digit;
        number /= 10;
        digit = number % 10;
        sum += digit;
        number /= 10;
        digit = number % 10;
        sum += digit;
        number /= 10;
        sum += number;

        System.out.println("Rəqəmlərin cəmi: " + sum);

    }

}
