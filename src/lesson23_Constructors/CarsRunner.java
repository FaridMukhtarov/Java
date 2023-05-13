package lesson23_Constructors;

public class CarsRunner {
    public static void main(String[] args) {

        // 1-ci Yontem (Parametr)
        Cars carToyota = new Cars("Toyota", "Camrry", "Benzin", 2022, 44000);
        System.out.println(carToyota);

        System.out.println("");

        // 2-ci Yontem (Yari Parametr)
        Cars carBMW = new Cars("BMW", "M5", "Benzin");
        System.out.println(carBMW);

        System.out.println("");

        // 3-cu Yountem (ParaMetrsiz)
        Cars carFord = new Cars();
        carFord.marka = "Ford";
        carFord.model = "Mustang";
        carFord.yanacaq = "Benzin";
        carFord.il = 2019;
        carFord.qiymet = 23000;
        System.out.println(carFord);



    }


}
