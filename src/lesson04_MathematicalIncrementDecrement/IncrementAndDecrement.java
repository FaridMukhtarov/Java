package lesson04_MathematicalIncrementDecrement;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        int number = 10;

        // Increment
        number = number + 3;  // Artirma novu birinci
        System.out.println(number);

        number *= 3; // Artirma novu ikinci
        System.out.println(number);

        number += 20;
        System.out.println(number);

        number++; // Artirma novu ucuncu
        System.out.println(number);


        // Decrement
        number = number - 3;  // Azaltmaq novu birinci
        System.out.println(number);

        number /= 2; // ikinci novu ikinci
        System.out.println(number);

        number--; // Ucuncu novu ucuncu
        System.out.println(number);
    }
}
