class Stack{
    int []Arry;
    int Top;
    int Maxsize;

    Stack(int size){
        Maxsize = size;
        Arry = new int[size];
        Top=-1;
    }
    boolean Isfull(){
        return Top+1==Maxsize;
    }
    boolean Isempty(){
        return Top==-1;
    }
    void push(int x){
        if(Isfull()){
            System.out.println(" Stack is Full!");
        }else{
            Top++;
            x=Arry[Top];
            System.out.println(x+" -----> Inserting");
        }
    }
    void pop(){
        if(Isempty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println(Arry[Top]+" -----> Removing");
            Top--;
        }
    }
    void PrintStack(){
        for(int i=0; i<=Top;i++){
            System.out.println("Printing Stack -----> "+Arry[i]);
        }
    }
    void Size(){
        System.out.println("Size of Stack -----> "+Top+1);
    }
    public static void main(String[] args) {
        Stack MyStack=new Stack(10);

    MyStack.push(25);
    MyStack.push(30);
    MyStack.push(35);
    MyStack.push(40);
    MyStack.push(45);
    MyStack.push(50);
    MyStack.pop();
    MyStack.push(100);

    }
}