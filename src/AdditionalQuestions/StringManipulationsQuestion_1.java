package AdditionalQuestions;

import java.util.Scanner;

public class StringManipulationsQuestion_1 {
    public static void main(String[] args) {

        //  istifadəçidən e-poçt alin
        //- poçtda @ yoxdursa, "etibarsız poçt"
        //- əgər poçtda @gmail.com yoxdursa, "poçt gmail olmalıdır"
        //- əgər poçt @gmail.com ilə bitmirsə, "poçtda yazı xətası var"

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa bir mail daxil edin: ");
        String mail = input.nextLine().toLowerCase();

        if (!mail.contains("@")){
            System.out.println("etibarsız Gmail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("poçt gmail olmalıdır");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("poçtda yazı xətası var");
        }else
            System.out.println("Ugurlu Gmail");
    }
}
