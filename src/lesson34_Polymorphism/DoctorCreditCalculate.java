package lesson34_Polymorphism;

public class DoctorCreditCalculate extends  BaseCreditCalculate{

    @Override
    public double baseCreditCalculation(double credit) {
        return credit * 1.20;
    }
}
