public class ReverseAnumber {
    public static void main(String args[]){
        int number = 4232142;
        System.out.println(Integer.MAX_VALUE/10+": "+Integer.MIN_VALUE/10);
        System.out.println(reverse(number));
    }

    static int reverse(int x) {
        int temp = 0, remainder = 0;
        while (x != 0) {
            remainder = x % 10;
            x /= 10;
            if (temp > Integer.MAX_VALUE/10)
                return 0;
            if (temp < Integer.MIN_VALUE/10)
                return 0;
            temp = temp * 10 + remainder;
        }
        return temp;
    }
}
