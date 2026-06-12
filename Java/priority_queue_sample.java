import java.util.*;

public class priority_queue_sample {
    static void main() {
      /*  PriorityQueue<Integer> que = new PriorityQueue<>(
                Comparator.reverseOrder()
        );

       que.offer(35);
        que.offer(10);
        que.offer(27);
        que.offer(20);

        while(!que.isEmpty())
        {
            System.out.print(que.poll()+" ");
        }*/

        PriorityQueue<Integer> que = new PriorityQueue<>(
                (a,b) -> b - a
        );

        que.offer(10);
        que.offer(7);
        que.offer(52);
        que.offer(74);
        que.offer(36);

       while(!que.isEmpty())
           System.out.print(que.poll()+ " ");




    }
}
