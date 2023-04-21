import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Stack, push, LIFO do/undo in text editor, browse history
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Cyberpunk 2077");
        stack.push("COD");
        //Peek -see at the top, pop - remove
        stack.peek();
        stack.pop(); //will cause an Exception if used more times than there are data entries

        // Queue FIFO, first come, first served
        /*  Java-specific, Queue is actually an interface - can't create an instance of an interface
            In this example, we'll use the LinkedList class
            add == enqueue == offer()
            remove == dequeue == poll() poll will not cause an exception
            peek()

            Queue used: buffer, priority queue (print jobs), etc.

        */

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steven");
        queue.offer("Harold");

        queue.poll();
        queue.poll();

        //System.out.println(queue);

        //Priority queue - FIFO, with higher priority served first

        Queue<Double> scores = new PriorityQueue<>(Collections.reverseOrder());

        scores.offer(3.0);
        scores.offer(2.0);
        scores.offer(2.5);
        scores.offer(4.0);
        scores.offer(1.5);

        /*
         while (!scores.isEmpty()) {
             System.out.println(scores.poll());
         }
        */

        /* Linked List, in Java implemented as Doubly - Linked List
          It has head and tail and a nested Node class
          Where it has element, prev and next pointers
          Each element stored in a non-consecutive memory location
          Advantages:
          * Dynamic data structure
          * Insertion and deletion of nodes O(1)
          * No/Low memory waste
          Drawbacks:
          * Greater memory usage (additional pointer/s)
          * No random access of elements (no index, O(n) search and access)

          Uses:
          1. Implements stacks/queues
          2. GPS nav
          3. Musical playlist

         */

        LinkedList<String> llist= new LinkedList<>();

        llist.offer("A");
        llist.offer("B");
        llist.offer("C");
        llist.offer("D");
        //llist.offer("E");
        llist.offer("F");

        //llist.poll();

        llist.add(4, "E"); // we still need to traverse the entire list to find the spot
        //i.e. no random access
        llist.remove("E");

        System.out.println(llist.indexOf("C"));

        System.out.println(llist.peekFirst());
        System.out.println(llist.peekLast());

        llist.addFirst("0");
        llist.addLast("G");

        String first = llist.removeFirst();
        String last = llist.removeLast();

        System.out.println(llist);

        //Now, let's explore the difference between Linked and Array Lists
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //*********LinkedList***********
        startTime = System.nanoTime();
        //*********ArrayList***********





        }

    }
