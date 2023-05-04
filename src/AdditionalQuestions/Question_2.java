package AdditionalQuestions;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        // İstifadəçidən bir herif al və əlifbada növbəti 3 hərfi çap edin.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char herif = input.next().charAt(0);

        System.out.print("The next three letters are: " + (char)(herif+1) + (char)(herif+2) + (char)(herif+3));
    }
}
