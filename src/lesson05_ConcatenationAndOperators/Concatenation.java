package lesson05_ConcatenationAndOperators;

public class Concatenation {
    public static void main(String[] args) {

        // Concatenation (String Birlesdirme)

        String s1 = "Java";
        String s2 = "Gozeldir";
        String s3 = ""; // Heclik
        String s4 = " "; // Space

        int in1 = 4;
        int in2 = 3;

        // Java7 Guzeldir43
        System.out.println(s1+(in1+in2)+s4+s2+in1+in2);

        // 34 Java
        System.out.println(s3+in2+in1+s4+s1);

        // 7Java Guzeldir
        System.out.println(in2+in1+s1+s4+s2);

        // Java gozeldir7
        System.out.println(s1+s4+s2+(in1+in2));

        // Java Gozeldir 12
        System.out.println(s1+s4+s2+s4+in1 * in2); // Vurma birince hesbalnir uste gelmeye gore
    }
}
