package lesson03_DataCastingAndWrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        // Primitive Data Type-de anacaq deyer olur, method olmaz;
        // Wrapper class- lar primitive data type deyerlerini alirlar ve ancaq methodlarida var

        // 	Wrapper Class
        /*
        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean
         */

        // Wrapper Objects
        Byte myByte = 1;
        Short myShort = 10;
        Integer myInt = 5;
        Long myLong = 26533333L;
        Float myFloat = 45.3F;
        Double myDouble = 433.43;
        Character myCha = 'a';
        Boolean myBoolean = true;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myCha);
        System.out.println(myBoolean);

        // Integeri Stringe cevir ve stringin uzulugunu al
        Integer intValue = 2444;
        String StrValue = intValue.toString();
        System.out.println(StrValue.length());

        Byte byteValue = 34;
        String byString = byteValue.toString();
        System.out.println(byString);

        String str3 = "434";
        Integer i = str3.length();
        System.out.println(i);

        int num = 20;
        Integer num1 = 20;
        System.out.println(num1.byteValue());

        byte b = 23;
        Byte b1 = 23;
        System.out.println(b1.equals(b));

        char ch = 'b';
        Character character = 'c';

        System.out.println(Character.isDigit('7'));
        System.out.println(Character.isLetter('2'));


        String str = "123";
        String str1 = "22";
        System.out.println(str + str1);
        System.out.println(Integer.parseInt(str) + Integer.parseInt(str1));
        // Integer.parseInt(str) String deyer reqemelerden ibaretdirse integere cevirir

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        Integer num4 = 4;
        Integer num5 = 5;
        System.out.println(num5 + num4);
        System.out.println(String.format(num4.toString()) + String.format(num5.toString()));
        // bu integeri Stringe cevirir

    }
}
