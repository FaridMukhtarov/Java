package lesson31_InheritanceConstructorCall;

public class Corolla extends Toyota{

    Corolla (int pc){
        super(5);
        System.out.println("Parametirli Corolla constructor");
    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("String parametirli Corolla Constructor");
    }

    public static void main(String[] args) {

        Corolla corolla3 = new Corolla("Farid");
        //Parametresiz car constructor
        //Parametresiz Toyota Constructor
        //String parametreli Corolla Constructor

        System.out.println("=======");
        Corolla corolla1= new Corolla();
        //Parametresiz car constructor
        //Parametresiz Toyota Constructor
        System.out.println("=======");

        Corolla corolla2=new Corolla(3);
        //Parametresiz car constructor
        //parametreli Toyota Constructor
        //parametreli Corolla constructor
    }
}
