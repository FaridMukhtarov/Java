package lesson18_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class SplitQuestion {
    public static void main(String[] args) {

        // verilen bir culmeden bir kelmeyi secim onu ayri variable atanin

        String cumle = "Java gozeldir oyrenmeye deyer cunku Java populyar dildir";
        String soz = "Java";
        String[] yeniCumle = new String[3];

        String[] cumleArray = cumle.split(" ");
        for (int i = 0; i < cumleArray.length; i++) {
            if (cumleArray[i].equalsIgnoreCase(soz)){
                yeniCumle = new String[]{cumleArray[i]};
            }
        }
        String java = yeniCumle[0];
        System.out.println(java);

    }
}
