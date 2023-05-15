package lesson27_VarargsAndStringBuilder;

public class StringBuilder_4 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java ne qeder Gozeldir");

        System.out.println(sb.substring(13)); // Gozeldir
        System.out.println(sb.substring(4,7)); // ne
        System.out.println(sb); // Java ne qeder Gozeldir

        // sb=sb.substring(0,4); bərabərliyin solunda StringBuilder, sağda String
        // Java primitiv olmayan məlumatları cast etmir
        // Eyni qeyd integer, Bayt və short kimi ədədləri ehtiva edən primitiv olmayanlara da aiddir.


        // sb-də gözəl sözü varmı?
        /*
           String Builder-də olmayan String Class-nda olan metodlardan istifadə etmək istəyirsinizsə
           Bir dəfə toString() ilə Stringə çevirin və sonra String manipulation edile biler
         */
        System.out.println(sb.toString().contains("Gozel")); // true


        // .setCharAt() istelinen index-deki deyeri tek karakter olaraq deyismek ve ya boyudub kiciltmek olur
        sb.setCharAt(5,'N');
        System.out.println(sb); // Java Ne qeder Gozeldir
    }
}
