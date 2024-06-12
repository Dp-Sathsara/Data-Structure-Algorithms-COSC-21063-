public class Queue {
    int front;
    int rear;
    int Maxsize;
    int queuearr[];
    int count;

    Queue(int size){
        Maxsize = size;
        front=0;
        rear=-1;
        queuearr = new int[size];
        count=0;
    }
    boolean isfull(){
        return Maxsize == rear+1;
    }
    void Enqueue(int x){
        if(isfull()){
            System.out.println("Queue is Full....! ");
        }else{
            rear++;
            queuearr[rear]=x;
            System.out.println("Inserting..... >>> "+x);
            count++;
        }
    }
    boolean isEmpty(){
        return front>rear;
    }
    void Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty...!");
        }else{
            System.out.println("Removing......>>> " + queuearr[front]);
            front++;
            count--;
        }
    }
    void Printqueue(){
        for(int i=front; i<=rear; i++){
            System.out.println(">>> "+queuearr[i]);
        }
        System.out.println("Count......>>> "+count);
    }

/*public static void main(String[] args) {
    Queue myQueue =new Queue(5);

    myQueue.Enqueue(100);
    myQueue.Enqueue(200);
    myQueue.Enqueue(300);
    myQueue.Enqueue(400);
    myQueue.Enqueue(500);
    

    myQueue.Dequeue();
    myQueue.Dequeue();
    //myQueue.Enqueue(600);
    myQueue.Dequeue();
    myQueue.Enqueue(500000);

    myQueue.Printqueue();
}*/
}

