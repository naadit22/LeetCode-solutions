import java.util.Scanner;

public class IceCreamDistribution {
    public static void main(String[] args) {
        int m,n;
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] c = new int[n];
        int[] size = new int[m];

        for(int i = 0;i<n;i++){
            c[i] = sc.nextInt();
        }

        for(int i = 0;i<m;i++){
            size[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(size[j]>=c[i]){
                    res = c[i];
                }
            }
        }
        System.out.println(res);
    }
}
