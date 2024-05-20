import java.util.Scanner;

public class NegativesandPositives {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            long[] ele = new long[n];
            int no=0;
            long min=Long.MAX_VALUE;
            long sum=0;
            for(int i=0;i<n;i++){
                ele[i]=sc.nextInt();
                if(ele[i]<0){
                    no++;
                }
                if(min>Math.abs(ele[i])){
                    min=Math.abs(ele[i]);
                }
                sum+=Math.abs(ele[i]);
            }
            if(no%2==1){
                sum-=(2*min);
            }
            System.out.println(sum);
        }
    }
}
