package lesson17_Scope;

public class LocalVariables {
    public static void main(String[] args) {

        int num = 10; // locale variable
        String name = "Farid"; // locale variable
    }

    public void method1 (){
        int num1 = 25; // locale variable
    }

    public static void method2(){
        String name = "farid"; // locale variable
    }

    public void method3(){

        double sayi = 23.4;

        for (int i = 0; i < 10; i++) { // locale variable

            sayi=sayi=23;
            boolean trueOldu = true;
            byte by = 22;
            String familya = "Mukhtarov";
        }
    }
}
