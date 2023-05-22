package lesson39_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListPractice {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Farid");
        queue.add("Gunduz");

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
