import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DivideandEqualize {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            Map<Integer,Integer> a=new HashMap<>();
            for(int i=0;i<n;i++){
                int d=sc.nextInt();
                for(int j=2;j<Math.sqrt(d)+1;j++){
                    while (d%j==0){
                        d/=j;
                        a.put(j,a.getOrDefault(j,0)+1);
                    }
                }
                if(d!=1){
                    a.put(d,a.getOrDefault(d,0)+1);
                }
            }
            int flag=0;
            for(Integer c:a.keySet()){
                if(a.get(c)%n!=0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
