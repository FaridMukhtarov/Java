package lesson12_ForLoops;

public class ForLoopQuestion_3 {
    public static void main(String[] args) {

        // Verilen bir cumledki
        // Boyuk herif, kicik herif ve space sayilrini tapin
        // space sayisini nezere alaraq necedene kelme olaraq
        // nece eded kicik ve boyuk herif oldugunu yazdirn

        String  str = "Java oyrenen isi tapar";
        int space = 0;
        int boyukHerif = 0;
        int kicikHerif = 0;

        for (int i = 0; i < str.length() ; i++) {
            char charakter = str.charAt(i);

            if (charakter >= 'a' && charakter <= 'z'){
                kicikHerif++;
            } else if (charakter >= 'A' && charakter <= 'Z') {
                boyukHerif++;
            } else if (charakter == ' ') {
                space++;
            }
        }
        System.out.println("Cumledeki Soz Sayi: " + (space+1)
                +"\nBoyuk Herif Sayi: " + boyukHerif
                + "\nKicik Herif Sayi: " + kicikHerif
                + "\nBosluq Sayi: " + space);
    }
}
