package lesson12_ForLoops;

public class ForLoop {
    public static void main(String[] args) {

        // repeat ile
        String str = "Java\n";
        System.out.println(str.repeat(10));

        // for ile
        for (int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //  2 ededli reqemleri 7 ile bolune bilenleri yan yana yazdir
        for (int i = 10; i<100; i++){
            if((i%7)==0) System.out.print(i + " ");
        }

        System.out.println();

        // 13 den baslayib 100 qeder 7 7-i yazdir
        for (int i = 13; i<=100; i+=7){
            System.out.print(i + " ");
        }

        System.out.println("");
        // 1-den 10 qeder (Serhedler daxil) reqemlerin kvadratlarini yazdirin
        for (int i = 0; i <= 10; i++) {
            System.out.print(i * i + " ");


        }
    }
}
