package lesson15_OverloadingAndWhileLoop;

public class WhileLoop_1 {
    public static void main(String[] args) {

        // 2 edeli reqemlerin arasinda bir bosluq olacaq sekilde yana yazdir

        for (int i = 10; i <= 99 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // while loop ile
        int j = 10;
        while (j<=99){
            System.out.print(j+ " ");
            j++;
        }
    }
}
