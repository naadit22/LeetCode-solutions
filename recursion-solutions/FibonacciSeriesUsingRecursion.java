package Recursion;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        int end = 3;
        System.out.println(fib(end));
    }

    static int fib(int end){
        if(end==0){
            return 0;
        }
        if(end==1){
            return 1;
        }
        return fib(end-1)+fib(end-2);
    }
}
