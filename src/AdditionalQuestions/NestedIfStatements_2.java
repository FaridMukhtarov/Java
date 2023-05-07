package AdditionalQuestions;

import java.util.Scanner;

public class NestedIfStatements_2 {
    public static void main(String[] args) {

        // İstifadəçidən alınan məhsulların sayını və siyahı qiymətini alın və
        // istifadəçidən müştəri kartı olub-olmadığını soruşun. Müştəri kartı varsa
        // 10-dan çox məhsul alana 20%, yoxsa 15%, müştəri kartı yoxdursa,
        // 10-dan çox məhsul alana 15% endirim edin. yoxsa 10% endirim edin

        Scanner input = new Scanner(System.in);

        System.out.print("Zehmet olmasa alinan mesularin sayini daxil edin: ");
        int mesulSayi = input.nextInt();

        System.out.print("Zehmet olmasa alinan mesularin siyahı qiymətini daxil edin: ");
        double mesulQiymeti = input.nextDouble();

        System.out.print("Zehmet olmasa Bonus kartiniz olub olmadigini qeyyd edin (Beli / Xeyir): ");
        String kart = input.next();
        double endirim = 0;

        if (kart.equalsIgnoreCase("Beli")){
            if (mesulSayi >= 10){
                endirim = mesulSayi * mesulQiymeti * (0.8);
                System.out.println("Size 20% endirim olundu! " + endirim);
            } else if (mesulSayi > 0 && mesulSayi < 10) {
                endirim = mesulSayi * mesulQiymeti * (0.85);
                System.out.println("Size 15% endirim olundu! " + endirim);
            }

        } else if (kart.equalsIgnoreCase("Xeyir")) {
            if (mesulSayi >= 10){
                endirim = mesulSayi * mesulQiymeti * (0.85);
                System.out.println("Size 20% endirim olundu! " + endirim);
            } else if (mesulSayi > 0 && mesulSayi < 10) {
                endirim = mesulSayi * mesulQiymeti * (0.85);
                System.out.println("Size 10% endirim olundu! " + endirim);
            }

        }else
            System.out.println("Zehmet olmasa Beli ve ya Xeyir diye melumat daxil edin: ");
    }
}
