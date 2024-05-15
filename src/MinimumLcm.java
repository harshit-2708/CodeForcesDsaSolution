import java.util.Scanner;

public class MinimumLcm {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a-->0){
            int b=sc.nextInt();
            int[] ans=findLCM(b);
            System.out.println(ans[0]+" "+ans[1]);
        }
    }

    private static int[] findLCM(int b) {
        int c=(int) Math.sqrt(b)+1;
        int[] ans=new int[2];
        ans[0]=1;
        ans[1]=b-1;
        for(int i=2;i<=c;i++){
            if(b%i==0&&i<=b/i){
                int max=b/i;
                int[] d=findLCM(i);
                if(ans[1]>max*d[1]) {
                    ans[0] = max * d[0];
                    ans[1] = max * d[1];
                }
            }
        }
        return ans;
    }
}
