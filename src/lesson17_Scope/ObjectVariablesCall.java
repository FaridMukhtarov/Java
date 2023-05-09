package lesson17_Scope;

public class ObjectVariablesCall {
    public static void main(String[] args) {

        // ClassLevelVariables Class-indan instance variable-lari call etmek

        ClassLevelVariables personal2 = new ClassLevelVariables();
        System.out.println(personal2.personalAdi); // Yoxdur
        System.out.println(personal2.personalYas); // 0

        personal2.personalAdi = "Ferid";
        personal2.personalYas = 28;
        personal2.personalTel = "75692659";

        System.out.println(personal2.personalAdi); // Ferid
        System.out.println(personal2.personalYas); // 28
        System.out.println(personal2.personalTel); // 75692659


        ClassLevelVariables personal1 = new ClassLevelVariables();
        personal1.personalAdi = "Gulnar";
        personal1.personalYas = 26;
        personal1.personalTel = "847365";

        System.out.println(personal1.personalAdi); // Ferid
        System.out.println(personal2.personalAdi); // Gulnar

        System.out.println(personal1.personalAdi +" "+ personal2.personalAdi);


        ClassLevelVariables personal3 = new ClassLevelVariables();
        personal3.personalAdi = "Arzu";
        personal3.personalYas = 23;
        personal3.personalTel = "362485";

        System.out.println(personal1.personalYas); // 28
        System.out.println(personal2.personalYas); // 26
        System.out.println(personal3.personalYas); // 23
    }
}
