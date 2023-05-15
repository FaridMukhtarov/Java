package lesson33_Overriding;

public class Birds extends Animals{

    protected boolean dimdiyiVarMi = true;
    protected  boolean qanadlariVarMi = true;

    @Override
    protected void coxalmma (){
        System.out.println("Yumurta qoyaraq coxalirlar");
    }

    @Override
    protected void nefes (){
        System.out.println("Agciyerle nefes alirlar");
    }

    @Override
    protected void hereket(){
        System.out.println("Yeriyerek ve ucaraq hereket edirler");
    }
}
