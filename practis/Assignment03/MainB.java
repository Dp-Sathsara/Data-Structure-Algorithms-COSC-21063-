package Assignment03;

import java.util.List;

public class MainB {
    public static void PrintBestSellingByRegion(B_SList list){
        for(int i=0; i<3; i++){
            int max = list.sales[0][i];
            int maxIndex = 0;
            for(int j=0;j<list.size(); j++){
                if(list.sales[j][i]>max){
                    max = list.sales[j][i];
                    maxIndex=j;
                }
            }
            System.out.println(list.productNames[maxIndex]+" is the Best selling in region "+(i+1));
        }
    }
    public static void printBestSelling(B_SList list){
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < list.size(); i++){
            int total = 0;
            for(int j = 0; j < 3; j++){ෂ්
                total += list.sales[i][j];
            }
            if(total > max){
                max = total;
                maxIndex = i;
            }
        }
        System.out.println(list.productNames[maxIndex] + " is the best selling overall");
    }
    public static void main(String[] args) {
        B_SList list=new B_SList(10);
        list.insert("Product A", new int[]{1450,467,3800});
        list.insert("Product B", new int[]{5678,4892,2791});
        list.insert("Product C", new int[]{2987,270,6983});
        list.insert("Product D", new int[]{829,1500,29});
        PrintBestSellingByRegion(list);
        printBestSelling(list);
    }
}
