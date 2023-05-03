package lesson09_StringManipulations;

public class Manipulation_nullPointer {
    public static void main(String[] args) {

        String str1 = "";
        // str1 melumat elave edilmisdir
        System.out.println(str1); // Heclik yazdiracaq
        System.out.println(str1.concat("Java")); // Java

        String str2;
        // str2 yaradildi amma melumat elave edilmedi
        // System.out.println(str2); // str2-ye deyer elave edilmediyi ucun yazdirmaz altini qirmizi xetdiyecek
        str2 = "Java Gozeldir";
        System.out.println(str2.concat(".")); // Java.


        String str3 = null; // str3-e deyer elave edilmemisdir
        // null pointer Java-ya deyer elave etmediyimizin ferqinde oldugumuzu deyirik
        System.out.println(str3); // null
        System.out.println(str3.concat("Java")); // NullPointerException verir
        System.out.println(str3 + "Java"); // nullJava
    }
}
