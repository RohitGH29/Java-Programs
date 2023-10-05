package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int f = fibo(4);  // find n th term 
        System.out.println(f);
    }

    public static int fibo(int n){

        if(n==0 || n==1)
          return n;

        int f1=fibo(n-1);
         //System.out.println(f1);
        int f2=fibo(n-2);
       // System.out.println(f2);
        int fn=f1+f2;
       // System.out.println(fn);
        return fn;  
    }

}
