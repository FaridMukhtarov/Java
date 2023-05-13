package lesson23_Constructors;

public class Cars {

    String marka = "Teyin Edilmeyib";
    String model = "Teyin Edilmeyib";
    String yanacaq;
    int il;
    int qiymet;


    // Full Parametirli
    public Cars(String marka, String model, String yanacaq, int il, int qiymet){
        this.marka = marka;
        this.model = model;
        this.yanacaq = yanacaq;
        this.il = il;
        this.qiymet = qiymet;
    }

    // Half Parametirli
    public Cars (String marka, String model, String yanacaq){
        this.marka = marka;
        this.model = model;
        this.yanacaq = yanacaq;
    }

    // Default
    public Cars (){

    }

    // toString methdodunu cagirmaq cmd+n  alt+n
    @Override
    public String toString() {
        return "    Cars" +
                "\nMarka: " + marka +
                "\nModel: " + model +
                "\nYanacaq: " + yanacaq +
                "\nIl: " + il +
                "\nQiymet: " + qiymet;
    }
}
