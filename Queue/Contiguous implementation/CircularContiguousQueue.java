public class CircularContiguousQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public CircularContiguousQueue(int size) {
        maxSize = size + 1;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int data) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = data;
            System.out.println("Inserting..... >>> "+data);
            nItems++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front];
            System.out.println("Removing......>>> " + temp);
            front = (front + 1) % maxSize;
            nItems--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize - 1);
    }
}