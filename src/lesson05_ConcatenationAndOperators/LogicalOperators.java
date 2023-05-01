package lesson05_ConcatenationAndOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical (Mentiqi) Operators.  ( &&, ||, !. )

        // && And
        // || Or
        // != Deyil

        // Java-da qarsiladirma operatoru sadece 2 variable-i qarsiladirir

        int a = 10;
        int b = 20;
        int c = 15;

        //  ucunun birbirine beraber oldugunu yoxlayin
        System.out.println( a == b && b == c); // false

        // a reqeminin pozitif ve 2 ile bolune bildiyini yoxlayin
        System.out.println(a > 0 && a % 2 == 0); // true

        // b reqeminin 10 ile 50 arasinda oldugunu yoxlayin
        System.out.println(b > 10 && b < 50); // true

        // b reqeminin 10 ile 50 arasinda olmadigini yoxlayin
        System.out.println(b < 10 || b > 50); // false


    }
}
