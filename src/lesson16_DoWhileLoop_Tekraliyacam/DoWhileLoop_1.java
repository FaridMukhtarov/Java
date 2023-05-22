package lesson16_DoWhileLoop_Tekraliyacam;

public class DoWhileLoop_1 {
    public static void main(String[] args) {

        // 10,11,12 Reqemlerini toplayan  bir while loop yarad

        int reqem = 10;
        int toplama = 0;

        do {
            toplama = toplama+reqem;
            reqem++;

        }while (reqem<=12);

        /*
        do while loop-un iki ustunluku var
        1- loop body-si en az bir defe isleyir
        2- while bitme kontrolu loop qeder isleyir
         */
    }
}
