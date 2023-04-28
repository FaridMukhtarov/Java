package lesson03_DataCastingAndWrapperClass;

public class intToString_DataCasting {
    public static void main(String[] args) {

        // create int type variable
        int num = 10;
        System.out.println("The integer value is: " + num);

        // converts int to string type
        String data = String.valueOf(num);
        System.out.println("The string value is: " + data);



        // create byte type variable
        byte by = 100;
        by = by = 100 + 4;
        System.out.println("The byte value is: " + by);

        // converts byte to string type
        String byData = String.valueOf(by);
        System.out.println("The byte value is: " + byData);

    }
}
