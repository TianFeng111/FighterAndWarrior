package Queue;

/**
 * Created by TianFeng on 2018/11/17.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.MyQueue(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.getList());
        System.out.println(queue.pop());
        System.out.println(queue.getList());
        System.out.println(queue.top());
        System.out.println(queue.getList());
        System.out.println(queue.count());
        queue.FreeMyQueue();
        System.out.println(queue.getList());
    }
}
