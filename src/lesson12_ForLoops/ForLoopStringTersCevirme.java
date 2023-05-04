package lesson12_ForLoops;

public class ForLoopStringTersCevirme {
    public static void main(String[] args) {

        String str = "Java gozeldir";

        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.println(str.substring(i, i + 1));
        }
    }
}
