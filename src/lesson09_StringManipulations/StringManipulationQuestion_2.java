package lesson09_StringManipulations;

public class StringManipulationQuestion_2 {
    public static void main(String[] args) {

        // Istifadeciden bir cumle ve bir metin alin cumlede metnin vezyetine gore
        // 1- Cumlede metn yoxdur
        // 2- cumle metni sadece 1 kere iceriyor
        // 3- cumle metni birden fazla iceriyor
        // secimlerden  uygun olani yazdir

        String cumle = "Java cox gozeldir cox.";
        String metin = "cox";

        int firstIndex = cumle.indexOf(metin);
        int secondIndex = cumle.lastIndexOf(metin);

        if (firstIndex==-1){
            System.out.println("Cumlede metin yoxdur");
        }else if(firstIndex==secondIndex){
            System.out.println("cumlede metin sadece 1 eded var");
        }else {
            System.out.println("cumlede metin birden cox var");
        }
    }
}
