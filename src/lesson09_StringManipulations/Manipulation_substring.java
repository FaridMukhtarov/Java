package lesson09_StringManipulations;

public class Manipulation_substring {
    public static void main(String[] args) {

        // substring
        // Istelinen Herifden daxil olmaqla ve sonrakilari almag ucun

        String str = "Javani oyren isi al";
        System.out.println(str.substring(6)); // oyren isi al
        System.out.println(str.substring(0)); // Javani oyren isi al
        System.out.println(str.length()); // 19

        // Son karakteri String olaraq elave edin
        String sonHerif = str.substring(str.length()-1); // son herifi alib string atmaq
        System.out.println(sonHerif);

        // Son karakteri UpperCase olaraq yazdir
        System.out.println(str.substring(str.length()-1).toUpperCase()); // L

        // Son 3 herifi boyuk olaraq ekrana yazdir
        System.out.println(str.substring(str.length()-2).toUpperCase()); // Al


        // Ikinci Nov ( substring beginIndex endIndex)
        String str1 = "Java gun kecdikce gozelesir";
        System.out.println(str1.substring(5,8)); // gun
        System.out.println(str1.substring(9,18)); // kecdikce

        String password = str1.substring(9,18);
        System.out.println(password);

        String name = password.substring(0,1).toUpperCase() // Ilk herif Boyuk eledik
                + password.substring(1).toLowerCase(); // ilk herifden sonrasi Kicik

        System.out.println(name);
        System.out.println(name.substring(3,4));
        System.out.println(name.substring(3,3)); // Hecne yazdirmaz ""
    }
}
