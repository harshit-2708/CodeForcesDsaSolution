import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RomaticGlasses {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        for(int o=0;o<a;o++){
            long b=sc.nextLong();
            Set<Long> c=new HashSet<>();
            long flag=0;
            long sum=0;
            c.add(0l);
            for(long i=0;i<b;i++){
                long d=sc.nextLong();
                if(i%2==0){
                    sum-=d;
                }else{
                    sum+=d;
                }
                if(c.contains(sum)){
                    flag=1;
                }
                c.add(sum);
            }
            if(flag==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
