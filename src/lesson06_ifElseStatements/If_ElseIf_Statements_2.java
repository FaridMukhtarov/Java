package lesson06_ifElseStatements;

public class If_ElseIf_Statements_2 {
    public static void main(String[] args) {

        // istifadeciden aldigi mesulun sayini ve list qiymetini al
        // istifadecinin musteri karti olub olmadigini sorus
        // musteri karti varsa 10 mesuldan artiq alibsa %20 yoxsa %15 endirim edin
        // musteri karti yoxdursa 10 mesuldan  artiq alibsa %15 yoxsa %10 endirim edin

        int say = 20;
        boolean kart = true;
        double qiymet = 34;
        double toplamqiymet = 0;

        if (kart && say>=10){
            toplamqiymet = say*qiymet*(0.8);
            System.out.println("Size 20% endirim olundu! " + toplamqiymet);

        } else if (kart && say<10 && say>0) {
            toplamqiymet = say*qiymet*(0.85);
            System.out.println("Size 15% endirim olundu! " + toplamqiymet);

        } else if (!kart && say>10) {
            toplamqiymet = say*qiymet*(0.85);
            System.out.println("Size 15% endirim olundu! " + toplamqiymet);

        } else if (!kart && say<10 && say>0) {
            toplamqiymet = say*qiymet*(0.90);
            System.out.println("Size 10% endirim olundu! " + toplamqiymet);
        }else{
            System.out.println("Kecersiz giris");
        }
    }
}
