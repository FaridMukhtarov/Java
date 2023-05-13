package lesson23_Constructors;

public class DefaultConstructorCar {

    // Default constructor (Java Terfinden arxa planda yaradilan, Bizim Gormediyimiz Constructor)

    // Bir layihə yaratarkən bütün Class-larda main metoda olmasina ehtiyac youxdur
    // Əksər Class-lar Object yaradaraq istifadə olunmaq üçün hazırlanmış depolardır
    // Gəlin bu Class-i avtomobil Object-i üçün anbar kimi dizayn edək

    // Hər dəfə bir class yaradılanda java, o Class-dan object yaradılmasi ucun
    // Default constructor yaradır
    // Bu Default constructor görünmür
    // Default constructor heç bir parametri yoxdur və bizim üçün standart Object yaradır


    String marka = "Marka qeyyd edilmedi";
    String model = "Model qeyyd edilmedi";
    String yanacaq;
    int il;
    int qiymet;


    public String toString() {
        return "Avtomobil Xususiyyetleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyanacaq : " + yanacaq +
                "\nil : " + il +
                "\nqiymet : " + qiymet ;
    }

    public int maxSuret(String yanacaq){
        int maxSuret=120;

        if(yanacaq.equalsIgnoreCase("dizel")){
            maxSuret=200;
        } else if (yanacaq.equalsIgnoreCase("benzin")) {
            maxSuret=230;
        } else if (yanacaq.equalsIgnoreCase("elektrikli")) {
            maxSuret=180;
        }
        return maxSuret;
    }
}
