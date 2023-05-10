package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_3 {
    public static void main(String[] args) {

        // İstifadəçidən və axtarılacaq mətndən String alın. Sətirdə axtarılan mətnin istifadəsini yoxlayın və aşağıdakı cümlələrdən uyğun birini çap edin.
        //- Sətirdə axtarılan mətn yoxdur
        //- Axtarılan mətn String-də yalnız bir dəfə istifadə olunur
        //- Axtarılan mətn yalnız String-də 1-dən çox istifadə edilmişdir

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir cumle daxil edin: ");
        String cumle = input.nextLine();
        System.out.print("Zehmet olmasa axtardiqiniz sozu daxil edin: ");
        String soz = input.next();


        if (!cumle.contains(soz)){
            System.out.println("Cumlede axtarılan soz yoxdur");
        }else {
            int birinciIndex = cumle.indexOf(soz);
            int ikinciIndex = cumle.lastIndexOf(soz, birinciIndex + 1);
            if (ikinciIndex == -1) {
                System.out.println("cumled metin birden cox var ");
            } else {
                System.out.println("cumlede metin sadece 1 eded var ");

            }
        }
    }
}
