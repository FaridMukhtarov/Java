package lesson08_TernaryOperatorAndSwitchCase;

public class NestedTernary_1 {
    public static void main(String[] args) {

        int say = -444;

        // if nested Ternary
        if (say>0) {
            System.out.println(say%2==0 ? "Cut Reqem" : "Tek Reqem");
        } else {
            System.out.println(say<-99 && say >- 1000 ? "Uc reqemli" : "Uc Reqemli deyil");
        }

        // Nested Ternary
        String nested = say>0
                ?
                say%2==0 ? "Cut Reqem" : "Tek Reqem"
                :
                say<-99 && say >- 1000 ? "Uc reqemli" : "Uc Reqemli deyil";
        System.out.println(nested);
    }
}
