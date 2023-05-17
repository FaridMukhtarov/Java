package lesson37_Interfaces;

public class ConcreteChildClassOfInterface implements Interface_01{

    // Bir Class-i Bir interface-in child-i etmek ucun implements keyword istifade edilir

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interfaces
        // Reqem = 30; yazili olmasada Interfaces icerisinde oldugundan
        //             final-dir ve assignment edilmez

        System.out.println(Integer.MAX_VALUE);
        // Normalda Varible adlari, kicik heriflerle baslayir ve camelCase istifade edilir
        // ancaq java-da ortaqqebul olaraq
        // static ve final olaraq isaretleninen variable-lar tamamile BOYUK HERIFLE yazilir

        System.out.println(Math.PI);
    }
    @Override
    public void method1() {

    }

    @Override
    public int nethod2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;

    }

}
