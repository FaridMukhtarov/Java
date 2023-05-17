package lesson39_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDataType {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();
        q1.add("H");
        q1.add("A");

        q1.offer("K");
        // tutum limitiniz olmadığı halda add() ilə eyni şeyi edir

        System.out.println(q1.remove()); // H
        // Queue elavni sona edib, istifadeni basdan etdiyi ucun
        // parametre daxil edtmediyimizde basdaki elementi remove eder ve bize dondurer

        System.out.println(q1.remove("K")); // true

        q1.remove(); // bos queue qaldi []
        System.out.println(q1);
        // q1.remove(); queue bos oldugundan NoSuchElementException verir


        System.out.println(q1.poll()); // null
        // q1.poll() remove ile eyi emeliyati eder yeni basdaki elementi siler ve bize dondurer
        // aralarindaki ferq bos queue'da isletiklerinde
        // remove exception verirken, poll exception vermez

        q1.add("H");
        q1.add("A"); // [H, A]

        System.out.println("peek : " + q1.peek()); // H
        // silmeden queue'nun basindaki elementi bize getirir
        // eger queue bossa null getirecek

        System.out.println("element : "+q1.element()); // H

        q1.clear(); // queue'yu bosalttdiq

        System.out.println("peek : " + q1.peek()); // null
        // System.out.println("element : "+q1.element()); // exception

    }
}
