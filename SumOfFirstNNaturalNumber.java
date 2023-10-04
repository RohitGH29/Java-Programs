package Recursion;

public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
    }


    public static int sum(int n){
        if(n==1)
           return 1;

        return n+sum(n-1);   
    }

}
