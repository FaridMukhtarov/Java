package lesson12_ForLoops;

public class StringTersCevirme {
    public static void main(String[] args) {

        // istifadeciden bir string isteyib ve stringi ters cevirib yadasda saxla

        String input = "Java hergun gozelesir";
        String tersInput = "";

        for (int i = input.length()-1; i >= 0; i--) {
            tersInput += input.substring(i, i+1);
        }
        System.out.println("Ters vezyeti: " + tersInput); // riselezog nugreh avaJ
    }
}
