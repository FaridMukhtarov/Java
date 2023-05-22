package lesson37_Interfaces_Tekraliyacam;

public class ChildOfInterfaceStaticVeDefaultMethods implements InterfaceStaticVeDefaultMethods{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public static void main(String[] args) {


        ChildOfInterfaceStaticVeDefaultMethods obj = new ChildOfInterfaceStaticVeDefaultMethods();
        obj.method3(); // Interface icinde body-li default method

        InterfaceStaticVeDefaultMethods.method4(); // Interface icinde body-li static method
    }
}
