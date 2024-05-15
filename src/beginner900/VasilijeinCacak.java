package beginner900;

import java.util.Scanner;

public class VasilijeinCacak {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int o=0;o<q;o++){
            long n=sc.nextLong();
            long k=sc.nextLong();
            long sum=sc.nextLong();
            long min=(k*(k+1))/2;
            long max=(k*(n+(n-k)+1))/2;
            if(sum>=min&&sum<=max){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
