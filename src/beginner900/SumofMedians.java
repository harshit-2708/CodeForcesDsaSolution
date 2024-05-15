package beginner900;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumofMedians  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        for(int o=0;o<p;o++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<k*n;i++){
                a.add(sc.nextInt());
            }
            int b=n*k;
            long ans=0;
            for(int i=0;i<k;i++){
                b-=((n/2)+1);
                ans+=a.get(b);
            }
            System.out.println(ans);
        }
    }
}
