package lesson34_Polymorphism;

public class TeacherCreditCalculate extends BaseCreditCalculate {

    @Override
    public double baseCreditCalculation(double credit) {
        return credit * 1.25;
    }
}
