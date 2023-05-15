package lesson34_Polymorphism;

public class SoldierCreditCalculate extends BaseCreditCalculate{


    @Override
    public double baseCreditCalculation(double credit) {
        return credit * 1.30;
    }
}
