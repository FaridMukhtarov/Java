package lesson34_Polymorphism;

public class CallCredit {
    public static void main(String[] args) {

        BaseCreditCalculate doctor = new DoctorCreditCalculate();
        BaseCreditCalculate teacher = new TeacherCreditCalculate();
        BaseCreditCalculate soldier = new SoldierCreditCalculate();

        System.out.println("For Doctor: " + doctor.baseCreditCalculation(1000));
        System.out.println("For Teacher: " + teacher.baseCreditCalculation(1000));
        System.out.println("For Soldier: " + soldier.baseCreditCalculation(1000));
    }
}
