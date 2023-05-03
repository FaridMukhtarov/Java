package lesson09_StringManipulations;

public class StringManipulationQuestion_7 {
    public static void main(String[] args) {

        //Soru 5 : Istifadeciden  ad ve familya ayri ayri alin.
        // - ad daha uzun ise, ad ve faimilyanin ilk herifi buyuk qalanlar kucuk seklilde yazdirin
        // - familya daha uzun ise adin ilk herifi buyuk digerleri kicik, familya buyuk heriflerle yazdirin.

        String name = "FerId ";
        String lastname = "MuKHhtarov";

        if (name.length() > lastname.length()){
            System.out.println(name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase()
                    + lastname.substring(0,1).toUpperCase()+ lastname.substring(1).toLowerCase());
        } else if (lastname.length() > name.length()) {
            System.out.println(name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase()
                    + lastname.substring(0).toUpperCase());
        }else {
            System.out.println("Ad ve Familya Uzunlugu eynidir:");
        }
    }
}
