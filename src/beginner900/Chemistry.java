package beginner900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int o=0;o<a;o++){
            int n=sc.nextInt();
            int q=sc.nextInt();
            Map<Character,Integer> b=new HashMap<>();
            String c=sc.next();
            for(int i=0;i<c.length();i++){
                b.put(c.charAt(i),b.getOrDefault(c.charAt(i),0)+1);
            }
            int ans=0;
            for(Character dp:b.keySet()){
                ans+=b.get(dp)%2;
            }
            if(ans-q<=1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

