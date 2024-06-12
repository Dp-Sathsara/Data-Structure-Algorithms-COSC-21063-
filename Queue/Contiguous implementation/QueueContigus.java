public class QueueContigus {
    int front;
    int rear;
    int Maxsize;
    int queuearr[];
    int count;

    QueueContigus(int size){
        Maxsize = size;
        front=0;
        rear=-1;
        queuearr = new int[size];
        count=0;
    }
    boolean isfull(){
        return count==Maxsize;
    }
    void Enqueue(int x){
        if(isfull()){
            System.out.println("Queue is Full....! ");
        }else{
            rear = (rear +1)%Maxsize;
            queuearr[rear]=x;
            System.out.println("Inserting..... >>> "+x);
            count++;
        }
    }
    boolean isEmpty(){
        return count==0;
    }
    public void Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty...!");
        }else{
            int x=queuearr[front];
            System.out.println("Removing......>>> " + queuearr[front]);
            front=(front +1)% Maxsize;
            count--;
            //return x;
        }
    }
    int Queuesize(){
        return count;
    }
    void Printqueue(){
        for(int i=front; i<=rear; i++){
            System.out.println(">>> "+queuearr[i]);
        }
        System.out.println("Count......>>> "+count);
    }

/*public static void main(String[] args) {
    QueueContigus myQueue =new QueueContigus(5);

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
