public class Stack{
    int arr[];
    int top;
    int Maxsize;

    Stack(int size){
        arr=new int[size];
        Maxsize=size;
        top=-1;
    }
    boolean isfull(){
        return top+1 == Maxsize;
    }
    boolean isEmpty(){
        return top == -1;
    }
    void push(int x){
        

        if(isfull()){
            System.out.println("Is Stack Full.");
        }else{
            top++;
        arr[top]=x;
        System.out.println("Inseting >>>>>> "+x);
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
        }else{
            System.out.println("Removing >>>>>> "+arr[top]);
            top--;
        }
    }
    void printStack(){
        for(int i=0; i<=top; i++){
            System.out.println("");
            System.out.print("Printing Stack  <<<<<<  ");
            System.out.println(arr[i]);
        }
    }
    void Size(){
        System.out.println(" ");
        System.out.println("Stack Size >>> "+top+1);
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.pop();
        //myStack.pop();
        myStack.push(40);
        myStack.pop();
        myStack.push(50);
        myStack.push(62);
        myStack.push(250);

        myStack.printStack();
        myStack.Size();
        //myStack.pop();
       // myStack.pop();
    }
} 