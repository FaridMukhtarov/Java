package lesson18_Arrays;

public class EnUzunEnQisaKelme {
    public static void main(String[] args) {

        // verilen string bir array-da en uzun en qisa kelmeleri yazdiran bir method yaradin

        String[] arr = {"Ferid", "Fuad", "Eldeniz", "Qerib"};

        enUzunEnQisaKelme(arr);
    }

    public static void enUzunEnQisaKelme (String[] arr){
        String enUzun = arr [0];
        String enQisa = arr [0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length() > enUzun.length()){
                enUzun = arr[i];
            }
            if (arr[i].length() < enQisa.length()){
                enQisa = arr [i];
            }
        }
        System.out.println("En Uzun ad: " + enUzun);
        System.out.println("En Qisa: " +enQisa);

    }
}
