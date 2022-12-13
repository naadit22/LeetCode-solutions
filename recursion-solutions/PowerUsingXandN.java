package Recursion;

import java.text.DecimalFormat;

public class PowerUsingXandN {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.print(myPow(2.1,-3));
    }

    static double myPow(double x, double n) {
        if (n == 1)
            return x;

        double res = Math.pow(x,n);
        return res;
    }
}
