package lesson28_AccessModifier;

public class AccessModifierCall {
    public static void main(String[] args) {

        System.out.println(AccessModifier.name); // Ferid

        AccessModifier.now(); // Fuad

        System.out.println(AccessModifier.name); // Fuad
        System.out.println(AccessModifier.number); // 25

        AccessModifier aM = new AccessModifier();
        aM.name = "Ferahim";
        System.out.println(aM.name); // Ferahim
    }
}
