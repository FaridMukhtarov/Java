package lesson09_StringManipulations;

public class StringManipulationQuestion_4 {
    public static void main(String[] args) {

        // istifadecinin girdiyi cumlede
        // Herifden basqa hersey silinecek
        // Not: Space silinmeyecek

        String input = "Ja_5+va cox 1*gozel";
        input = input.replaceAll("\\d", "");
        input = input.replace(" ", "5");
        input = input.replaceAll("\\W", "");
        input = input.replace("_", "");
        input = input.replaceAll("\\s+", " ");
        input = input.replaceAll("\\d", " ");


        System.out.println(input);
    }
}
