public class MainQ {
    public static void main(String[] args) {
        Queue MQ=new Queue(10);
        MQ.enqueue(100);
        MQ.enqueue(200);
        MQ.enqueue(300);
        MQ.enqueue(400);
        MQ.enqueue(500);
        MQ.enqueue(600);
        MQ.printQueue();
        MQ.Queuesize();
        MQ.dequeue();
        MQ.dequeue();
        MQ.enqueue(10); 
        MQ.enqueue(20);
        MQ.enqueue(30);
        MQ.enqueue(40);
        MQ.enqueue(50);
        MQ.enqueue(60);
        MQ.printQueue();
    }
}
