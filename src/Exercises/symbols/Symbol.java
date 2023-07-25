package Exercises.symbols;

public class Symbol {
    public String x;
    public String y;
    public int start;
    public String finish;
    public void printing(){
        for (start = 0; start <5 ; start++) {
            System.out.println(x);
            System.out.println(y);
        }
        while(start==5){
            System.out.println(finish);
            start++;
        }
    }
}
