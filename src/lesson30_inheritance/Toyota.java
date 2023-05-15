package lesson30_inheritance;

public class Toyota extends Masin{

    Toyota(){
        super();
        System.out.println("Toyota cons. isledi");
    }

    protected String marka = "Toyata";
    protected String motor= "Toyota masinlari cevreci motor istifade edir";
    protected String istesalYeri="istisal yeri qeyd edilmeyib";
    protected int suret=140;
}
