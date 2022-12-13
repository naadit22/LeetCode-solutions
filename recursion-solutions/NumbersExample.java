package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        //base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
