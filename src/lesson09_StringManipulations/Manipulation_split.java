package lesson09_StringManipulations;

import java.util.Arrays;

public class Manipulation_split {
    public static void main(String[] args) {


        // Split method-u istediyimiz string-i istediyimiz
        // yerden parcalara bolmek imkani ver

        String str = "Javani Mutleq oyrenecem";

        String[] spaceSplit = str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));
    }
}
