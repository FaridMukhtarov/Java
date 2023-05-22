package lesson36_AbstractClasses_Tekraliyacam;

public abstract class ParentAbstractClass {

     /*
      Abstract bir class abstract method'lara sahip olabiler
      Bir class'i abstract etmek  ucun  class declaration'ina
      abstract keyword elave edilmelidir
     */

    public abstract void mecburiMethod1();
    public abstract void mecburiMethod2();
    // Abstract method-larin body-si olmaz

    public String concreteMethod() {
        // Bu gunu qeder istifade etdiyimiz normal method-lar
        // abstract olmuyan method demek yerine concrete method deyilir
        return "";
    }

    /*
    Bir parent class-da child class-larin mutleq override edeceyi bir method yaratdigimizda
    method body-si gereksizlesir, cunku hec islemeyecekdir

    1- abstract class-dan object yaradilmayacagi ucun object-ler ucun bu method istifade edilmez
    2- child class-lar da mecburen bu method-u override edeceklerinden
       bu method-larin body-si hec vaxt ISTIFADE EDILMIYECEKDIR

    Java hec isdifade edilmiyecek bu method body-leri yazmamiza imkan verir
     */


    // Child class-larin mutleq override etmesini istediyimiz method-lari
    // abstract olarq tanitariq ve body-siz olaraq yaradiriq

}
