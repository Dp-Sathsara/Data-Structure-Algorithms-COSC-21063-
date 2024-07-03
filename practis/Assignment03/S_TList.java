package Assignment03;

/**
 * S_TList
 */
public class S_TList {

    private int[]list;
    private int size;
    private int capacity;
    
    public S_TList(int num){
        this.size=0;
        this.capacity=num;
        this.list=new int[this.capacity];
    }
    public void add(int x){
        if(this.size==this.capacity){
            this.capacity*=2;
            int[] temp = new int[this.capacity];
            for(int i=0;i<this.size;i++){
                temp[i]=this.list[i];
            }
            this.list=temp;
        }
        this.list[this.size]=x;
        this.size++;
    }
    public void remove(int index){
        if(index<0 || index>=this.size){
            throw new IndexOutOfBoundsException();
        }
        for(int i=0; i< this.size-1;i++){
            this.list[i]=this.list[i+1];
        }
        this.size--;
    }
    public int get(int index){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        return this.list[index];
    }
    public void set(int index,int x){
        if(index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException();
        }
        this.list[index]=x;
    }
    public int size(){
        return this.size;
    }
    public boolean isempty(){
        return this.size==0;
    }
    public void clear(){
        this.size=0;
    }
    public void print(){
        for(int i = 0; i < this.size; i++){
            System.out.print(this.list[i] + " ");
        }
        System.out.println(); 
    }
    public void sort(){
        for(int i=0; i< this.size-1;i++){
            for(int j=0;j<this.size-i-1;j++){
                if(this.list[j]>this.list[j+1]){
                    int temp=this.list[j];
                    this.list[j]=this.list[j+1];
                    this.list[j+1]= temp;
                }
            }
        }
    }
}