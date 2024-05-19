import java.util.Scanner;

public class BuyingTorches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();
            if(n<=1){
                System.out.println(-1);
                continue;
            }
            long total=((long) d *(k+1)-1);
            long ans=total/(n-1)+(total%(n-1)>0?1:0);
            System.out.println(d+ans);
        }
    }
}
