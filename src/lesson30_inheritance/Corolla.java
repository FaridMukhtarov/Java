package lesson30_inheritance;

public class Corolla extends Toyota{

    String model = "Corolla";
    String istesalYeri = "Yaponya";

    Corolla() {
        super();
        System.out.println("Corolla cons. isledi");
    }

    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        System.out.println(corolla.marka);
    }

        /*
          Bir child class'dan obje yaradigimizda
          yaradilan object sadece child class'a aid ozellikleri deyil
          butun parent class'l;arindaki ozellikleri de dasiyir.

          Bir object-in bir class'in ozelliklerini dasimasi ucun
          o object yaradilirken class'a ait constructor'in islemis  olmasi gerekir
          Yani child class'indaki object yaradilirken
          butun parent class'lardaki constructor'lar da ovtomatik olarak isleyir

          java bu islem ucun bele bir mexanizma yaratmisdir.
          Bir class yaratdigimizda biz constructor yaratmasak da
          Java'nin o class'a default constructor koydugu KIMI
          extends keyword ISTIFADE EDEN bir class'da yaradilan her bir constructor'in
          ilk satirina biz gormesek de super() constructor call qoyar.
         */
}
