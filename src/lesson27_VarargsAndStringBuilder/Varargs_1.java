package lesson27_VarargsAndStringBuilder;

public class Varargs_1 {
    public static void main(String[] args) {

        topla(5,7); // 12
        topla(4,6,8); // 18
        topla(4,6,7,8); // 25
    }

    // parametir sayisi degistikce bizden yeni method yaratmagimizi isteyir
    private static void topla(int i, int i1) {
        System.out.println("2 Reqemin Cemi: " + (i+i1));
    }
    private static void topla(int i, int i1, int i2) {
        System.out.println("3 Reqemin Cemi: " + (i+i1+i2));
    }
    private static void topla(int i, int i1, int i2, int i3) {
        System.out.println("4 Reqemin Cemi: " + (i+i1+i2+i3));
    }
}
