package lesson36_AbstractClasses;

public class ChildClassOfParentClass extends ParentAbstractClass{

    // Abstract bir class'daki, abstract method-larin HAMISI
    // concrete child class-lar terefinden override edilmelidir

    @Override
    public void mecburiMethod1() {
        System.out.println("Child class method icerisinde met");

    }

    @Override
    public void mecburiMethod2() {

    }
}
