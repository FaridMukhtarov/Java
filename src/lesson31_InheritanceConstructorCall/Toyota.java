package lesson31_InheritanceConstructorCall;

public class Toyota extends Car {

    Toyota() {
        System.out.println("Parametresiz Toyota Constructor");
    }

    Toyota(int pt) {
        System.out.println("Parametirli Car Constructor");
    }

    Toyota(String pt2) {
        super("Farid");
        System.out.println("String Parametirli Toyota Constructor");
    }
}
