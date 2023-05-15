package lesson36_AbstractClasses;

public abstract class Car {

    // Car class-ini inherit eden butun class-lar
    // motor, marka, kuza ve teker methodundan istidfade etsin
    // ancaq abs, kondisoner methodlari optional olsun
    // isteyen child bu method-lari override etsin, isteyen override etmesin

    public abstract void motor();
    public abstract void marka();
    public abstract void kuza();
    public abstract void teker();

    public void abs(){
        System.out.println("Guvenliyi artirmaq istiyen istifade etsin");
    }

    public void kondisoner(){
        System.out.println("Rahatliq istiyen masinlar istifade ede biler");
    }
}
