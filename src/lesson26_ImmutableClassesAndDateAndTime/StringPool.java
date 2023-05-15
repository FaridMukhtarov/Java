package lesson26_ImmutableClassesAndDateAndTime;

public class StringPool {
    public static void main(String[] args) {


        // Java dilində "string pool" (və ya "string literal pool") tez-tez istifadə
        // olunan sətirlər üçün yaddaşda ayrıca sahə təmin edir (String Hovuzu). Bu sahə yaddaşda yalnız
        // bir dəfə olur və ona lazım olan bütün sətirlər orada yerləşdirilir. Beləliklə,
        // eyni sətir birdən çox yaradıldıqda, yaddaşda yalnız bir kopiyasi saxlanılır və bütün
        // digər referanslar həmin kopiyaya işarə edir. Bu yaddaş istifadəsini azaldır və performansı artırır.

        // == true qayıtması üçün həm referansa, həm də deyeri eyni olmalıdır,
        // equals() isə yalnız dəyərlərə baxır, buna görə də təəccüblənməyəcəksiniz.

        // Eger javada bir islem ile yaradilan bir String varsa
        // ve ya Obyekt (Object) yaradilaraq elde edilen bir String varsa
        // her halda bir Obyekt (Object)  yaradir

        String str1 = "Java"; // String hovuzu yardir burda java (str1, str2) eyni deyere sahib olduglari ucun
        String str2 = "Java";

        String str3 = new String("Java"); // object yaradir java

        String str4 = ""; // object yaradir java
        str4 = str4.concat("Java");

        String str5 = "Ja";
        str5 = str5.concat("va");

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1 == str3); // true

        System.out.println(str1.equals(str4)); // true
        System.out.println(str2 == str4); // false

        System.out.println(str4.equals(str5)); // true
        System.out.println(str4 == str5); // false

        System.out.println("Java".equals(str3)); // true
        System.out.println("Java".equals(str5)); // true
        System.out.println("Java" == str4); // false

    }
}
