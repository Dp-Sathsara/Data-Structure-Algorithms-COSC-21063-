public class Queue {
    int front;
    int rear;
    int maxsize;
    int []Qarry;
    int nitems;
    Queue(int Size){
        maxsize=Size+1;
        Qarry=new int[Size];
        front=0;
        rear=-1;
        nitems=0;
    }
    boolean isfull(){
        return nitems==maxsize-1; 
    }
    boolean isempty(){
        return (nitems==0);
    }
    void enqueue(int x){
        if(isfull()){
            System.out.println("Queue is Full!");
        }else{
            rear=(rear+1)%maxsize;
            Qarry[rear]=x;
            System.out.println(x+" -----> Inserting");
            nitems++;
        }
    }
    void dequeue(){
        if(isempty()){
            System.out.println("Queue is Empty!");
        }else{
            System.out.println(Qarry[front]+" -----> Removing");
            front=(front+1)%maxsize;
            nitems--;
        }
    }
    void printQueue(){
        for(int i=0;i<=maxsize;i++){
            System.out.println("Element printing -----> "+Qarry[i]);
        }
    }
    void Queuesize(){
        System.out.println(nitems);
    }
}
