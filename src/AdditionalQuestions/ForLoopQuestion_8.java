package AdditionalQuestions;

import java.util.Scanner;

public class ForLoopQuestion_8 {
    public static void main(String[] args) {

        // (interview)- istifadeciden pozitif bir eded alin, 1’den baslayaraq butun tamsayilari yazdirin, sira
        // -3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // -5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // -hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin


        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa pozitiv reqem daxil edin: ");
        int reqem = input.nextInt();

        for (int i = 1; i <= reqem ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("fizzBuzz ");
            }else if (i % 3 == 0){
                System.out.print("fizz ");
            } else if (i % 5 == 0){
                System.out.print("buzz ");
            }else
                System.out.print(i + " ");

        }

    }
}
