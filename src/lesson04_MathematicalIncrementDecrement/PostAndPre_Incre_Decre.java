package lesson04_MathematicalIncrementDecrement;

public class PostAndPre_Incre_Decre {
    public static void main(String[] args) {

        //        int a = 20;
//        int b = 20;
//
//        // Post increment (a++) evel kod isleyir sonra artiri
//        System.out.println("A: " + a++);
//
//        // Pre Increment (++b) evel artiri sonra kod isleyir
//        System.out.println("B: " + ++b);
//
//        int c = 10;
//
//        int d = c++;
//        int f = ++d;
//
//        System.out.println("a: " + c + ", d: " + d + ", f: " + f );


//        int a = 10;
//        int b = a++;
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//
//        int c = 10;
//        int d = ++a;
//
//        System.out.println("c: " + c);
//        System.out.println("d: " + d);

        int a=10;

        System.out.println("a'nin Deyeri : " + ++a);
        int b= a++;
        System.out.println("b'nin Deyeri : " + b);

        int c= b++ + a ;

        System.out.println("c'nin Deyeri : "+ c);

        System.out.println("Son toplam : " +(a+b+c));

    }
}
