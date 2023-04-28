package lesson03_DataCastingAndWrapperClass;

public class StringToInt_DataCasting {
    public static void main(String[] args) {

        // Anca string deyeri reqemden ibaret olanda cevrilir
        // create string type variable
        String data = "100";
        System.out.println("The string value is: " + data);

        // convert string variable to int
        int convert = Integer.parseInt(data);
        System.out.println("The integer value is: " + convert);
    }
}
