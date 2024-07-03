package Assignment03;

public class Main {
    public static void printDiagram(S_TList list){
        int stem=-1;
        for(int i=0;i<list.size();i++){
            int Num=list.get(i);
            int stemvalue=Num/10;
            int leafvalue=Num%10;
            if(stem!=stemvalue){
                stem=stemvalue;
                System.out.println("\b\b");
                System.out.print(stem+"|");
            }
            System.out.print(leafvalue+", ");
        }
    }
    public static void main(String[] args) {
        S_TList list = new S_TList(10);
            list.add(24);
            list.add(57);
            list.add(8);
            list.add(105);
            list.add(47);
            list.add(139);
            list.add(85);
            list.add(81);
            list.add(40);
            list.add(46);
            list.sort();
            printDiagram(list);

    }
    
}
