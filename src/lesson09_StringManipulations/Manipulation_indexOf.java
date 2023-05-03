package lesson09_StringManipulations;

public class Manipulation_indexOf {
    public static void main(String[] args) {

        String str = "Yasamaga deyer";
        System.out.println(str.indexOf("y"));  // ilk y-in index-sini getirir
        System.out.println(str.indexOf('s')); // char olaraqda qebul edir
        System.out.println(str.indexOf("deyer")); // block ve block-da ilk index-i verir
        System.out.println(str.indexOf("a",2)); // ikinci indexden sonra ki lazim olan index-i tapar 3 yazdirir
        System.out.println(str.indexOf("a",4)); // 5
        System.out.println(str.indexOf("e")); // 10
        System.out.println(str.indexOf("e", 11)); // 12


        System.out.println(str.indexOf("e")); // 10
        int ikinciIndex = str.indexOf("e"); // 10
        System.out.println(str.indexOf("e",ikinciIndex+1)); // 12

        // metinde ve ya cumlede olmuyan birseyi axtarsaz -1 doner java misal:
        System.out.println(str.indexOf("ferid")); // -1
        System.out.println(str.indexOf("x")); // -1
    }
}
