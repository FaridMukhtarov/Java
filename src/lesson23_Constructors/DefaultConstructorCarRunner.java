package lesson23_Constructors;

public class DefaultConstructorCarRunner {
    public static void main(String[] args) {

        DefaultConstructorCar avto = new DefaultConstructorCar();
        System.out.println(avto.marka
                + "\n" + avto.model
                + "\n" + avto.yanacaq
                + "\n" +  avto.il
                + "\n" + avto.qiymet);



        avto.marka = "BMW";
        avto.model = "M5";
        avto.yanacaq = "Benzin";
        avto.il = 2018;
        avto.qiymet = 50000;
        System.out.println(avto);



        System.out.println(avto.maxSuret(avto.yanacaq));


        // avto1-in xusuiyetlerini yazdirmaq istesek
        DefaultConstructorCar avto1 = new DefaultConstructorCar();

        System.out.println("Marka : " + avto1.marka +
                "\nModel : " + avto1.model+
                "\nBenzin : " + avto1.yanacaq+
                "\nil : " + avto1.il+
                "\nQiymet : " + avto1.qiymet);

        DefaultConstructorCar avto2 = new DefaultConstructorCar();

        System.out.println(avto2);
        System.out.println("---------------------------");
        System.out.println(avto);

        DefaultConstructorCar avto3= new DefaultConstructorCar();
        System.out.println("---------------------------");
        System.out.println(avto3);

    }
}
