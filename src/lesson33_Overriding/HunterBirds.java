package lesson33_Overriding;

public class HunterBirds extends Birds{

    @Override
    protected void qidalanmaq(){
        System.out.println("Et yiyerek qidalanirlar");
    }
    protected boolean penceleriVarMi = true;

    public static void main(String[] args) {

        /*
          Bir obyekt yaraderken
          constructor ve data novu eyni ise
          Hansi METHOD'un kecerli oldugunu tapmaq ucun
          o class'a geder varsa istifade ederik
          yoxsa sirasi ile parent'lara geder ilk tapdigimizi istifade ederik
       */

        HunterBirds bird = new HunterBirds();

        System.out.println(bird.gorurMu);
        System.out.println(bird.qanadlariVarMi);
        System.out.println(bird.penceleriVarMi);

        bird.qidalanmaq();
        bird.coxalmma();
        bird.hereket();
        bird.nefes();

        System.out.println("===================");

        Animals bird1 = new Birds();
        bird1.qidalanmaq(); // Animals
        bird1.nefes(); // Birds
        System.out.println(bird1.gorurMu); // Animals

        System.out.println("===================");

            /*
          Bir obyekt yaradilurken
          data novu ile constructor ferqli ise
          hansi METHOD'un kecerli olacagini tapmaq ucun
          evelce data novunun  oldugu class ve parent'larina baxaraq
          o method'u tapariq
          tapmasaq CTE verir
          taparsaq o deqiqe isletmerik
          isletmeden once o method override edilmise diye yoxlayariq
          override edilmisse override eden method'u islederik
         */

        Animals brid2 = new HunterBirds();
        brid2.coxalmma(); // Birds
        brid2.qidalanmaq(); // HunterBirds
        System.out.println(brid2.gorurMu);

        /*
           Metodlarla müəyyən edilən xüsusiyyətlər
           ən aktual məlumatları taparkən
           Variable ilə təyin olunan xüsusiyyətlər
           tapılan ilk dəyərdən istifadə edir

           metodlar üçün dinamik ozelik
           Variable statik ozelik deyilir
          */
    }
}

