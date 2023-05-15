package lesson36_AbstractClasses;

public abstract class Honda extends Car{

    // Abstract bir class-i ozumuze parent etdiyimizde
    // iki alternatifimiz olur
    // 1- Parent-imiz olan abstract class-daki butun abstract method-lari override etmek
    // 2- prject yaratmagimiz lazimdirsa bu class-i da abstract etmeliyik

    @Override
    public void marka(){
        System.out.println("Marka : Honda");
    }
    public abstract void yanacaq();
    public abstract void guvenli();

    public void xususiTexnologiya(){
        System.out.println("Butun Honda masinlari vtec texnologiyasini istifade eder");
    }
}
