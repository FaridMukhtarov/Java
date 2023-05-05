package Lesson14_MethodCreation;

public class AsalReqemMethod {
    public static void main(String[] args) {

        asalSayi(37);
        asalSayi(79);
    }
    public static void asalSayi (int eded){
        boolean asalmi = true;

        for (int i = 2; i < eded; i++) {
            if (eded % i == 0) {
                asalmi = false;
                break;
            }
        }
        if (asalmi){
            System.out.println(eded + " Asal reqem");
        }else
            System.out.println(eded + " Asal Reqem deyil");
    }
}
