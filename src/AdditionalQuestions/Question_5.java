package AdditionalQuestions;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        // İstifadəçidən ondaliqli ve tam ədəd alın, ondaliqli ədədi ikinci ədədə bölün
        // və bölmə əməliyyatının nəticəsinin tam hissəsini çap edin.

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet Ondaliqli eded Daxil edin: ");
        double ondaliqliEded = input.nextDouble();

        System.out.print("Zehmet tam eded Daxil edin: ");
        int tamEded = input.nextInt();

        int netice = (int) (ondaliqliEded / tamEded);
        System.out.println("Netice: " + netice);

    }
}
