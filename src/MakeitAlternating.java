import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeitAlternating {
    static List<Long> b=new ArrayList<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        factorial();
        for(int o=0;o<t;o++){
            String s=sc.next();
            char a=s.charAt(0);
            long c=1;
            long ans=1;
            int d=0;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==a){
                    c++;
                }else{
                    a=s.charAt(i);
                    ans=(ans*c)%998244353;
                    d+=(c-1);
                    c=1;
                }
            }
            d+=(c-1);
            ans=(ans*c)%998244353;
            System.out.println(d+" "+(ans*b.get(d))%998244353);
        }
    }

    static void factorial(){
        long a=1;
        b.add(1l);
        b.add(a);
        for(int i=2;i<=200000;i++){
            a=(a*i)%998244353;
            b.add(a);
        }
    }
}
