package Recursion;

public class IsPowerOfFour {
    public static void main(String[] args) {
        System.out.println(powerOf4(64));
    }

    static boolean powerOf4(int n){
        if (n <= 0) {
            return false;
        }
        while (n > 3) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return n == 1;
    }
}
