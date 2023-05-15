package lesson33_Overriding;

public class HouseBirds extends Birds{

    @Override
    protected void qidalanmaq(){
        System.out.println("Den yiyerek qidalanirlar");
    }

    public static void main(String[] args) {
        HouseBirds bird = new HouseBirds();
        bird.qidalanmaq();
        bird.coxalmma();
        bird.hereket();
        bird.nefes();
        System.out.println(bird.gorurMu);
        System.out.println(bird.dimdiyiVarMi);
        System.out.println(bird.qanadlariVarMi);

        System.out.println("------------------------");

        Animals bird1 = new HouseBirds();
        bird1.qidalanmaq(); // HouseBirds
        bird1.coxalmma(); // Birds
        bird1.nefes(); // Birds
        System.out.println(bird1.gorurMu);

        System.out.println("------------------------");

        Animals bird2 = new Birds();
        bird2.nefes(); // Birds
        bird2.qidalanmaq(); // Animals
        bird2.nefes(); // Birds

        System.out.println("------------------------");

        Animals bird3 = new Animals();
        bird3.nefes(); // Animals
        bird3.qidalanmaq(); // Animals
        bird3.coxalmma(); // Animals
        bird3.hereket(); // Animals
    }
}
