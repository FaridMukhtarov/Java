package lesson37_Interfaces;

public interface InterfaceChildOfinterface extends Interface_01{

    // eger bir interface-i basqa bir inter-in child-i etmek istesek
    // exends keyword istifade edilir

    // Bir interface concrete class-i INHERT EDEBILMEZ


    @Override
    void method1();

    // Interface bir child parent interface-deki
    // abstract method-u override ede biler amma
    // ikisinde body-si olmadigindan
    // bu emelyatin bir menasi yoxdur

    int method4();
    boolean method5();

}
