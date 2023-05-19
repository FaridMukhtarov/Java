package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_9 {
    public static void main(String[] args) {

        // İstifadəçidən parol istəyin, aşağıdakı şərtləri yoxlayın və istifadəçiyə düzəldilməli olan
        // çatışmayan elementləri söyləyin, əgər o, bütün şərtlərə cavab verirsə, "parol uğurla saxlandı" yazısını çap edin.

        //- ilk hərf kiçik hərf olmalıdır
        //- son simvol nömrə olmalıdır
        //- parolda boşluq olmamalıdır
        //- ən azı 10 simvol uzunluğunda olmalıdır

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zehmet olmasa parol daxil edin: ");
        String parol = scanner.nextLine();

        int flag = 0;

            if (!(parol.charAt(0) >= 'a') && (parol.charAt(0) <= 'z')){
                System.out.println("ilk hərf kiçik hərf olmalıdır");
                flag++;
            }
            if (!(parol.charAt(parol.length() - 1) >= '0') && parol.charAt(parol.length()-1) <= '9' ){
                System.out.println("son simvol nömrə olmalıdır");
                flag++;
            }
            if (parol.contains(" ")){
                System.out.println("parolda boşluq olmamalıdır");
                flag++;
            }
            if (parol.length() < 10 ){
                System.out.println("ən azı 10 simvol uzunluğunda olmalıdır");
                flag++;
            }
            if (flag == 0){
                System.out.println("parol uğurla saxlandı");
            }
    }
}
