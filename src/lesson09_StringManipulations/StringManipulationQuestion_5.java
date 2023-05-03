package lesson09_StringManipulations;

public class StringManipulationQuestion_5 {
    public static void main(String[] args) {

        // Sual 1 : Istifadeciden bir cumle alin
        // - cumlede ev varsa, "home home sweet home" yazdirin
        // - cumlede is varsa, "islemek gozeldir"
        // - ikis de varsa "Hem ev lazim hemde is"
        // - hicbiri yoxdursa "cox islemek lazimdir" yazdirin

        String cumle = "Eve geldim is var";
        String cumleCopy = cumle.toLowerCase();

        if (cumleCopy.contains("ev") && cumleCopy.contains("is")){
            System.out.println("Hem ev lazim hemde is");
        } else if (cumleCopy.contains("is")) {
            System.out.println("islemek gozeldir");
        } else if (cumleCopy.contains("ev")) {
            System.out.println("home home sweet home");
        }else {
            System.out.println("cox islemek lazimdir");
        }
    }
}
