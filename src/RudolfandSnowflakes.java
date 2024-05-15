import java.util.Arrays;
import java.util.Scanner;

public class RudolfandSnowflakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        short[] dp=new short[1000001];
        Arrays.fill(dp, (short) -1);
        for (int o = 0; o < t; o++) {
            int n = sc.nextInt();
            int flag=0;
            if(dp[n]!=-1){
                if(dp[n]==0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
                continue;
            }
            for (int i = 2; i < n-i; i++) {
                int c = (n * i - n + 1);
                if (c % i == 0) {
                    int j = 2;
                    while (Math.pow(i, j) < c) {
                        j++;
                    }
                    if (Math.pow(i, j) == c) {
                        flag=1;
                        System.out.println("YES");
                        dp[n]=1;
                        break;
                    }
                }
            }
            if(flag==0){
                dp[n]=0;
                System.out.println("NO");
            }
        }
    }
}
