package Recursion;
import java.util.*;
public class NumFrom1toNusingRecurrsion {
    //static int x =
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        print(N);
    }

    static void print(int N){
        //int x= 1;
        if(N == 0){
            return;
        }
        print(N-1);
        System.out.print(N+" ");
    }
}
