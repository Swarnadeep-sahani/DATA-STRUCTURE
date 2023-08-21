import java.util.*;

class priorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(1);
        pq.offer(5);
        pq.offer(3);
        pq.offer(4);

        Iterator<Integer>it=pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }        
    }
}
