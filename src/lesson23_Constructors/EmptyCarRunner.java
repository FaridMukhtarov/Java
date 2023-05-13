package lesson23_Constructors;

public class EmptyCarRunner {
    public static void main(String[] args) {

        EmptyCar avo1 = new EmptyCar();

        avo1.marka = "Mercedes";
        avo1.model = "E220";
        avo1.yanacaq = "Dizel";
        avo1.il = 1998;
        avo1.qiymet = 5000;

        System.out.println(avo1);

        EmptyCar avo2 = new EmptyCar("Toyota","Pirues","Benzin", 2016, 12000);
        System.out.println(avo2);

        EmptyCar avo3 = new EmptyCar("Opel","Corsa","Dizel",2013,10000);
        System.out.println(avo3);


        EmptyCar avo4 = new EmptyCar("Tesla","x",2020);
        System.out.println(avo4);
    }
}
