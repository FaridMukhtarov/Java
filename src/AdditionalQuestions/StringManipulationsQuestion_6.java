package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_6 {
    public static void main(String[] args) {

        // İstifadəçidən bir String və axtarılacaq mətini alın. Sətirdə axtarılan mətnin istifadəsini yoxlayın və aşağıdakı cümlələrdən uyğun birini çap edin
        //- Sətirdə axtarılan mətn yoxdur
        //- Axtarılan mətn String-də yalnız bir dəfə istifadə olunur
        //- Axtarılan mətn yalnız String-də 1-dən çox istifadə edilmişdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir cumle daxil edin: ");
        String cumle = input.nextLine();

        System.out.print("Zehmet olmasa axtarilacaq sozu daxil edin: ");
        String soz = input.next().toLowerCase();

        if (!cumle.contains(soz)) {
            System.out.println("Sətirdə axtarılan mətn yoxdur");
        } else {

            int birnci = cumle.indexOf(soz);
            int ikinci = cumle.lastIndexOf(soz, birnci + 1);

            if (birnci == -1) {
                System.out.println("Axtarılan soz  String-də 1-dən çox istifadə edilmişdir ");
            } else
                System.out.println("Axtarılan soz String-də yalnız bir dəfə istifadə olunub");
        }
    }
}