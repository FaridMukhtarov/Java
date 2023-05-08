package Lesson14_MethodCreation;

public class MethodCall {
    public static void main(String[] args) {

        // Method call


        int a = 10;
        int b = 20;
        // bu iki reqemin vurmasini ekrana kod yazdirmadan yazdir
        System.out.println(Method_Vurma.vurmaMethod(a, b)); // 200


        String c = "Happy";
        String d = "New Year";
        // Bu iki Stringin aralarinda bosluq buraxaraq yazdir
        System.out.println(Method_StringConcat.concatMethod(c,d)); // Happy New Year


        String e = "Bu il Planin nedir";
        // e Stringi Ters yazdir
        System.out.println(Method_String_TersCevirme.tersString(e)); // riden ninalP li uB


        // "Bu cumleni terse cevir"
        String ters = Method_String_TersCevirme.tersString("Bu cumleni terse cevir"); // rivec esret inelmuc uB
        System.out.println(ters);
    }
}
