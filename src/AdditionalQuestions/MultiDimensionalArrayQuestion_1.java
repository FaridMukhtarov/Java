package AdditionalQuestions;

public class MultiDimensionalArrayQuestion_1 {
    public static void main(String[] args) {

        // Verilmiş 2 qatlı array-de cüt ədədləri toplayan və nəticəni çap edən method yaradın.

        int[][] arrays = {{4, 5, 8, 9, 2}, {1, 3, 5, 10,}, {5, 2, 3, 5, 7, 8, 6}};
        int toplama = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] % 2 == 0){
                    toplama += arrays[i][j];
                }
            }
        }
        System.out.println(toplama);
    }
}
