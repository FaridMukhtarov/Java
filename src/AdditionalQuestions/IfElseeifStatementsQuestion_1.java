package AdditionalQuestions;

import java.util.Scanner;

public class IfElseeifStatementsQuestion_1 {
    public static void main(String[] args) {

        // İstifadəçidən cinsi və yaşı alın, Qadın, 60 yaş və yuxarı,
        // Kişi 65 yaş və yuxarı təqaüdə çıxa bilər. Cins və yaş nəzərə
        // alınmaqla “Təqaüdə çıxa bilərsiniz” və ya “Təqaüdə çıxmaq
        // üçün daha çox işləmək lazımdır..” çap edin.

        Scanner input = new Scanner(System.in);

        System.out.println("Zehmet Olmasa Cinsinizi qeyd edin: ");
        String cins = input.next();

        System.out.println("Zehmet olmasa Yasinizi daxil edin: ");
        int yas = input.nextInt();

        if (yas >= 60 && cins.equalsIgnoreCase("Qadin")){
            System.out.println("Təqaüdə çıxa bilərsiniz");
        } else if (yas >= 15 && yas < 60 && cins.equalsIgnoreCase("Qadin") ) {
            System.out.println("Təqaüdə çıxmaq üçün daha " + (60-yas) + " il işləmək lazımdır");
        } else if (yas >= 65 && cins.equalsIgnoreCase("Kisi")) {
            System.out.println("Təqaüdə çıxa bilərsiniz");
        } else if (yas >= 15 && yas < 65 && cins.equalsIgnoreCase("Kisi")) {
            System.out.println("Təqaüdə çıxmaq üçün daha " + (65-yas) + " il işləmək lazımdır");
        }else
            System.out.println("Kecersiz  melumat");
    }
}
