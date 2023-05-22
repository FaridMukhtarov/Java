package lesson39_Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(5);
        vector.add(64);
        vector.add(61);
        vector.add(7);
        vector.add(48);
        vector.add(3);
        vector.add(6);

        Iterator<Integer> iterator = vector.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
