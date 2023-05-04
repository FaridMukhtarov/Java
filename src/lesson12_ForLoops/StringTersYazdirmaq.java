package lesson12_ForLoops;

public class StringTersYazdirmaq {
    public static void main(String[] args) {

        // istifadeciden Bir String alib ve String-i ters yazdir

        String input = "Java neqeder gozeldir";
        for (int i = input.length()-1; i >= 0 ; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
