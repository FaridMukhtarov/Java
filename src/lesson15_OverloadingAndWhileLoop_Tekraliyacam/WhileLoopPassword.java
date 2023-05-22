package lesson15_OverloadingAndWhileLoop_Tekraliyacam;

import java.util.Scanner;

public class WhileLoopPassword {
    public static void main(String[] args) {

        // İstifadəçidən aşağıdakı tələblərə cavab verən parol tələb edin
        // İstifadəçi müvafiq parol daxil edənə qədər parolu yenidən tələb edin

        Scanner input = new Scanner(System.in);
        boolean passwordIsValid = false;
        String password = "";
        int flag = 0;

        while (!passwordIsValid){
            System.out.print("Zehmet olmasa sifre daxil edin: ");
            password = input.nextLine();
            flag=0;

            if (!(password.charAt(0)>='a' && password.charAt(0)<'z')){
                System.out.println("Sifreni ilk herifi kicik olmaliidr!");
                flag++;
            }
            if (!(password.charAt(password.length()-1) >= '0' && password.charAt(password.length()-1) <= '9')){
                System.out.println("Sifrenin sonu reqem olmalidir");
                flag++;
            }
            if (password.length()<8){
                System.out.println("Sifrenin en az 8 xarakter olmalidir!");
                flag++;
            }
            if (flag == 0){
                passwordIsValid = true;
                System.out.println("Sifreniz Uygundur!");
            }
        }
    }
}
