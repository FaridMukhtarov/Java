package Lesson14_MethodCreation;

public class FaktorialMethod {
    public static void main(String[] args) {

        // verilen bir sayinin Faktorial deyerini yazdiran bir method yaradin
        faktorialDeyer(5);
        faktorialDeyer(7);

    }

    public static void faktorialDeyer (int eded){
        int faktorial = 1;
        for (int i = eded; i >= 1; i--) {
            faktorial *= i;
        }
        System.out.println(eded + "! = " + faktorial);
    }
}
