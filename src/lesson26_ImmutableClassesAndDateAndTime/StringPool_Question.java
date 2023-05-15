package lesson26_ImmutableClassesAndDateAndTime;

public class StringPool_Question {
    public static void main(String[] args) {

        // run etmeden once (equals)
        String str = "";
        str +=2;
        str += 'c';
        str += false;

        if (str == "2cfalse"){
            System.out.println("==");
        }
        if (str.equals("2cfalse")){
            System.out.println("equals");
        }
    }
}
