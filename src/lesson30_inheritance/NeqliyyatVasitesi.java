package lesson30_inheritance;

public class NeqliyyatVasitesi extends BaseCar{

    protected String marka = "Butun nəqliyyat vasitəsinin markasi vardir";
    protected String model = "Butun nəqliyyat vasitəsinin modeli vardir";
    protected int il = 2020;

    protected void suret(String yanacaq){
        System.out.println("nəqliyyat vasitəsinin suret yanacaq novune gore deyisir");
    }

    protected void teker(){
        System.out.println("nəqliyyat vasitəsinin 4 tekeri olur");
    }
}
