package lesson37_Interfaces_Tekraliyacam;

public interface Interface_01  {

    // interface-ler full abstraction temin edir
    // yani interface icerisinde concrete method olmaz

    // Interface-ler ozlerini parent qebul edecek
    // child class-lar ucun bir blue-print (sablon) kimidir

    // interface-ler xüsusi struktur olduğundan
    // yazilsa da yazilmasada da butun variable-lar
    // public, static ve final-dir

    String MESAJ = "Hello Interfaces";
    static int REQEM = 30;
    public static boolean GOZELDIR = true;
    public static final int REQEM_FFULL = 40;



    // Eyni sekilde
    // Butub method-lar public ve abstract-dir

    void method1();
    abstract int nethod2();
    public abstract String method3();
}
