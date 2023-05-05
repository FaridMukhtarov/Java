package AdditionalQuestions;

import java.util.Scanner;

public class DataCastingQuestion_4 {
    public static void main(String[] args) {

        // İstifadəçidən iki qoşa ədəd alın, birinci ədədi ikinci ədədə bölün
        // və bölmə əməliyyatının nəticəsinin tam hissəsini çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstDouble = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondDouble = input.nextDouble();

        int quotient = (int) (firstDouble / secondDouble);
        System.out.println("The integer quotient of the division is: " + quotient);

    }
}
