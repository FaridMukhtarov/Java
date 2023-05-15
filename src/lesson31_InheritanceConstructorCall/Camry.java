package lesson31_InheritanceConstructorCall;

public class Camry extends Toyota{

    Camry (String pc){
        super("Deniz");
        System.out.println("String parametirli Camry");

    }

    Camry (){
    }

    public static void main(String[] args) {

        // Eger istifade edilen  argumente uygun bir constructor
        // parent class'da yoxsa CTE olur
        Camry camry = new Camry("Farid");
        // Parametirli Car constructor
        // String parametirli Toyota constructor
        // String parametirili Camry

        System.out.println("======");
        Camry camry1 = new Camry();
        // Parametirsiz Car Constructor
        // Parametresiz Toyota Constructor

    }

}
