package lesson37_Interfaces;

public interface InterfaceStaticVeDefaultMethods {

    /*
        java 8 ile Developer'larin telebi uzerine yeni bir istisnai vezyet java-ya elave edilmisdir

        bir interface'i iller icerisinde yuzlerce class inherit etmis olabilir
        sonradan interface-e elave edilen bir abstract method, butun kohne child'lar terefindan
        inherit edilmelidir, eksi teqdirde butun kohne child class-lar CTE verecekdir.

        Java 8 ile birlikde Java, interface-lere default veya static ile isaretlenmmek
        serti ile body'si olan method elave edilmesine  icase  vermisdir.
        Bu sayede interfaceee sonradan elave edilen method body-si oldugu ucun
        override edilmek mecburiyetinde  DEYILDIR

        Interface icerisinde body'si olan method yaratmaq icin istifade edilen
        default ve static keyword-leri arasinda tek bir ferq vardir

        default isdifade edilen  method-lar obyekt yaradaraq cagrilarken
        static olarak isaretlenen method'lar birbaşa istifade edilebiler
     */

    void method1();
    void method2();

    // interface'deki butun methodlar public ve abstractir
    // biz interface'deki bir method declaration-na default yazarsak
    // bu access modifier deyil

    public default void method3(){
        System.out.println("Interface icinde body-li default method");
    }

    public static void method4(){
        System.out.println("Interface icinde body-li static method");
    }
}
