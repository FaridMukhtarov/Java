package lesson29_Encapsulation;

public class Child extends Parent{

    /*
       java'daki inheritance'in insanlardan en buyuk ferqi :
       insanlarda parent child əldə edə bilər ama child parent'ini secemez
       Java'da ise tam tersidir
       - Siz bir class yaratdiginizda daha once yaradilmis class'lardan
       butun ozelliklerini inherit etmek istediyiniz class'i PARENT EDINIRSINIZ
       Bir class baska bir class'i inherit etmek istediyinde
       extends keyword ile bunu deklare eder
     */

    public static void main(String[] args) {
        Child child = new Child();
        child.age = 30;
        child.name = "Java";
        child.isEnough = false;
    }
}
