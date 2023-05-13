package lesson23_Constructors;

public class EmptyCar {

    String marka="Marka qeydedilmedi";
    String model="Model qeydedilmedi";
    String yanacaq;
    int il;
    int qiymet;


    public EmptyCar(String mark, String mod, String ync, int yl, int qmt) {
        // Parametirli constructor
        marka = mark;
        model = mod;
        yanacaq = ync;
        il = yl;
        qiymet = qmt;
    }

    public EmptyCar(String mark, String mod, int yl) {
        // istersek parametreleri azaldaraq-da constructor Yarada bilerik
        marka = mark;
        model = mod;
        il = yl;
    }

    public EmptyCar(){
        // görünən parametrsiz constructor
        // Default constructor DEYİL
        // Default constructor gövdəsi də boşdur
        // kod gövdəyə yalnız parametrsiz constructor-da yazıla bilər

        // parametrsiz constructor-un gövdəsində kod yoxdur
        // Defolt constructor-la eyni funksiyaları yerinə yetirir
        // lakin hələ də görünnur vezyetdeyse default constructor deyilmez
    }

    // Biz hər hansı görünən constructor yaratdıqda
    // java Default constructor-u siler
    // Bu vezyetde, əvvəllər yaradılmış Object-lerle bağlı problemlərin qarşısını almaq üçün
    // Class-a parametrsiz constructor əlavə etmək faydalıdır


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
