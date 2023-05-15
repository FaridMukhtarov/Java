package lesson35_Exceptions;

public class ArithmeticExceptionPractice {
    public static void main(String[] args) {

        // Verilen iki  tam reqemi Birbirine bolub
        // neticenin tam qisimini yazdirin

        int a = 20;
        int b = 0;

        try {
            // riskli oldugunu dusunduyum kod
            System.out.println(a / b);
            System.out.println("I,m working ");

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            // catch (ArithmeticException e)  dusunduyum  risk

            System.out.println("Sifira bolunmez");
            // catch(0 'den sonraki { } catch bloku deyilir
            // Gozlenilen risk Realasirsa isleyecek kodlar
        }

           /*
          Bwzi exception'lar if else ile handle edilebilir ancaq
          butun exception'lar ucun if else yeterli olmaz
         */
    }
}
