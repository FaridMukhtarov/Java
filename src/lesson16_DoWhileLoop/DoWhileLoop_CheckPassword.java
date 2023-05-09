package lesson16_DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop_CheckPassword {
    public static void main(String[] args) {

        /*
        Istifadeciden bir sifre daxil etmesini isteyib, daxil edilen
        sifreni asagidaki sertlere gore yoxlayin. istifadeci kecerli sifre daxil edene qeder
        bu prossesi davam ele ve kecerli sifre daxil etdiyinde "Sifreniz qebul edilmisdir!"
        1- Sifrede kicik herif olmalidir
        2 - sifrede boyuk herif olmalidir
        3- sifre en az 8 karakter olmalidir
        4- sifrede xususi xarakter olmalidir
         */


        Scanner input = new Scanner(System.in);
        String password;
        int ParentFlag;

        do {
            System.out.println("Zehmet olmasa Kecerl bir sifre daxil edin:");
            password = input.nextLine();
            ParentFlag = 0;

            // Sifre kicik herif-li olmalidir
            // kicik herif yoxlamasi eden bir method yaratmaq kicik herif varsa 1 yoxsa 0
            int netice = kicikHerifYoxlaMethodu(password);
            ParentFlag = ParentFlag + netice;

            // Sifre boyuk herif-li olmalidir
            // kicik herif yoxlamasi eden bir method yaratmaq kicik herif varsa 1 yoxsa 0
            netice = boyukHerifYoxlamaMethodu(password);
            ParentFlag = ParentFlag + netice;

            // sifre en xusisi simvul olmalidir
            // Xususi Xarakter yoxlamasi eden bir method yaratmaq kicik herif varsa 1 yoxsa 0
            netice = xususiXarakterYoxlaMethod(password);
            ParentFlag = ParentFlag + netice;

            // sifre en az 8 karakter olmalidir
            if (password.length() < 8) {
                System.out.println("Sifre en az 8 xarakter olmalidir!");
            } else {
                ParentFlag++;
            }

            // Flag 4 ise Sifre tamamdir deyiyilse Xeta var
        } while (ParentFlag != 4);{
            System.out.println("Sifreniz qebul edilmisdir!");
        }

    }


    public static int xususiXarakterYoxlaMethod(String password) {
        int flag = 0;
        String xususiXarakter = "!@#$%^&*()_+~}{><?:/";
        // sifrede xususi xarakter olmalidir
        // bunu ucun sifreni yoxlamaq ucun  for loop istifadesi
        for (int i = 0; i < password.length(); i++) {
            if (xususiXarakter.contains(password.substring(i, i+1))) {
                flag++;
                break;
            }
        }
        // flag == 0 ise xeta var simvul  yoxdur
        if (flag == 0) {
            System.out.println("Sifrede Xussisi Simvol olmalidr");
            return 0;
        } else return 1;
    }

    public static int boyukHerifYoxlamaMethodu(String password) {
        int flag = 0;
        // Sifrede Boyuk herif olmalidir
        // bunu ucun sifreni yoxlamaq ucun  for loop istifadesi
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                flag++;
                break;
            }
        }
        // flag == 0 ise xeta var Boyuk herif yoxdur
        if (flag == 0) {
            System.out.println("Sifrede Boyuk herif olmalidr");
            return 0;
        } else return 1;
    }

    public static int kicikHerifYoxlaMethodu(String password) {
        int flag = 0;
        // Sifrede kicik herif olmalidir
        // bunu ucun sifreni yoxlamaq ucun  for loop istifadesi
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                flag++;
                break;
            }
        }
        // flag == 0 ise xeta var kicik herif yoxdur
        if (flag == 0) {
            System.out.println("Sifrede kicik herif olmalidr");
            return 0;
        } else return 1;
    }
}
