package lesson24_StaticKeywordAndPassByValue;

public class PassByValue {
    public static void main(String[] args) {

        // Java dilinde "pass by value" termini, bir Variable-in bir method-a göndərilirken
        // həmin Variable-in dəyərinin copiyasi göndərilməsi deməkdir.
        // Bu, metodun içində edilən dəyişikliklərin, gönderilen Variable-in dəyərini dəyişməyəcəyi demekdir.
        // Məsələn, aşağıdakı kod nümunəsində, üsul daxilində edilən dəyişikliklər "number" variable-in dəyərine təsir etmir:


        //  Kodlarimizin aydin  olmasi ucun main method'dan diger method'lara
        //  parametre olaraq gonderdiyimiz variable'lar ucun eyni adli variable
        //  yartmaga USTUNLUK VERIRIK

        //  Java method'lar arasinda kecid ederken variable'i deyil
        //  variable'in value'sunu pass eder

        //  Bu Java'nin Pass By Value'ya ustunluk vermesinden qaynaglanir
        //  Eger method'un icerisinde etdiyiniz deyisikliyin
        //  main method icin de gecerli olmasini isterseniz
        //  main method icerisinde assignment etmeliyik (qiymet = endirimEle(qiymet);)


        double qiymet = 100;
        System.out.println(endirimEle(qiymet)); // 90
        System.out.println(qiymet); // 100

        qiymet = endirimEle(qiymet); // burda qiymeti qalici etdik
        System.out.println(qiymet); // 90


        int number = 7;
        System.out.println("After Value " + number); // 7
        vurma(number);
        System.out.println("Before Value " + number); // 7


        String name = "Ferid";
        System.out.println("After Value " + name);
        change(name);
        System.out.println("Before Value " + name); // Farid
    }

    private static double endirimEle(double qiymet) {
        // 10% endirim
        qiymet = qiymet * 0.9; // qiymet qalici olaraq 90 oldu
        return qiymet;
    }

    public static void change(String name) {
        name = "Fuad";
        System.out.println("In Method: " + name); // Fuad
    }
    public static void vurma(int number) {
        number *= 5;
        System.out.println("In Method: " + number); // 35
    }
}
