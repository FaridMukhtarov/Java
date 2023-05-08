package Lesson13_NestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki reqemler ucun vurma cedveli yarat


        // coldeki dongu setirleri yoxlayar
        for (int i = 1; i <=10 ; i++) {

            // ic dongu her setirde olan deyerleri yoxlayar
            for (int j = 1; j <=10 ; j++) {

                System.out.print(i*j + " ");
            }
            // ic donu bitdiyinde Javani asagi dusurtmeliyik
            System.out.println(""); // heclik yazaraq
        }
    }
}
