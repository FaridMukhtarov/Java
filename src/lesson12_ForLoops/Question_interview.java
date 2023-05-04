package lesson12_ForLoops;

public class Question_interview {
    public static void main(String[] args) {

        // istifadeciden pozitif bir reqem al, 1’den baslayaraq butun
        // tamsayilari yazdirin, sira
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        // yazdirin

        int reqem = 130;

        for (int i = 0; i <= reqem; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }

        }
    }
}
