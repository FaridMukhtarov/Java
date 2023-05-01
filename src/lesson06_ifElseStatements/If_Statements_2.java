package lesson06_ifElseStatements;

import java.util.Scanner;

public class If_Statements_2 {
    public static void main(String[] args) {

        // Istifadeciden bir herif ali
        // NOT: Boyuk ve kicik herif hessaligi olmasin

        Scanner input = new Scanner(System.in);
        System.out.print("Zehmet olmasa ayin ilk herifini daxil edin: ");
        char ilkHerif = input.next().charAt(0);

        if(ilkHerif == 'y' || ilkHerif == 'Y' ){
            System.out.println("Yanvar");
        }

        if(ilkHerif == 'f' || ilkHerif == 'F' ){
            System.out.println("Fevral");
        }


        if(ilkHerif == 's' || ilkHerif == 'S' ){
            System.out.println("Sentiyabr");
        }


        if(ilkHerif == 'n' || ilkHerif == 'N' ){
            System.out.println("Noyabr");
        }

        if(ilkHerif == 'd' || ilkHerif == 'D' ){
            System.out.println("Decabr");
        }

        if(ilkHerif == 'm' || ilkHerif == 'M' ){
            System.out.println("Mart ve ya May");
        }

        if(ilkHerif == 'i' || ilkHerif == 'I' ){
            System.out.println("iyun ve ya Iyul");
        }

    }
}
