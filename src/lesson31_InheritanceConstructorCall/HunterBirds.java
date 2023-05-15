package lesson31_InheritanceConstructorCall;

public class HunterBirds extends Birds{

    HunterBirds hunter1 = new HunterBirds();

    Birds hunter2 = new HunterBirds();

    Animals hunter3 = new HunterBirds();

       /*
           Bir child class'da object yaradmaq ucun
           child class constructor'i istifade edilir.

           Ama data novunu
           o object-in bagli oldugu class'lardan secebilerik

           Eger constructor ve data novu farqli secilirse
           bu vezyetde class uzuvu olan
           variable ve method'lar ferqli davranislar gosterirler
         */

    String str = new String("Qus");
}
