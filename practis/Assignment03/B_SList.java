package Assignment03;

public class B_SList {
    public String[] productNames;
    public int[][] sales;
    private int size;
    private int Capacity;

    public B_SList(int Capacity){
        this.size = 0;
        this.Capacity = 10;
        this.productNames = new String[this.Capacity];
        this.sales = new int[this.Capacity][3];
    }

    public void insert(String productName, int[] sale){
        if(this.size == this.Capacity){
            System.out.println("Capacity is full");
        }else{
            this.productNames[this.size] = productName;
            this.sales[this.size] = sale;
            this.size++;
    }

    this.productNames[this.size] = productName;
    this.sales[this.size] = sale;
    this.size++;
    }
    
    public int size(){
        return this.size;
    }
}
