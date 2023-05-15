package lesson30_inheritance;

public class Suv extends NeqliyyatVasitesi{
    public static void main(String[] args) {

        Suv suv1 = new Suv();
        System.out.println(suv1.marka); // Butun nəqliyyat vasitəsinin markasi vardir
        System.out.println(suv1.model); // Butun nəqliyyat vasitəsinin markasi vardir
        System.out.println(suv1.motor); // Butun Masinlarda Motor var
        System.out.println(suv1.yanacaq); // Masinlar ferqli yanacaq novlerinden istifade edilir
        System.out.println(suv1.nomre); // Butun Masinlarda Nomre var
        System.out.println(suv1.il); // 2020
        suv1.suret("Benzin"); // nəqliyyat vasitəsinin suret yanacaq novune gore deyisir
        suv1.teker(); // nəqliyyat vasitəsinin 4 tekeri olur


        Suv suv2 = new Suv();
        suv2.marka = "Toyota";
        suv2.model = "Rav4";
        suv2.motor = "1.6";
        suv2.nomre = "90 MF 095";
        suv2.yanacaq = "Benzin";
        suv2.il = 2018;
        suv2.suret(suv2.yanacaq);
    }

    public void suret(String yanacaq){
    }
}
