package beginner900;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DeletiveEditing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int o=0;o<a;o++){
            String s=sc.next();
            String t=sc.next();
            Map<Character,Integer> b=new HashMap<>();
            for(int i=0;i<t.length();i++){
                b.put(t.charAt(i),b.getOrDefault(t.charAt(i),0)+1);
            }
            StringBuilder st=new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                if(b.containsKey(s.charAt(i))&&b.get(s.charAt(i))>0){
                   st.append(s.charAt(i));
                   b.put(s.charAt(i),b.get(s.charAt(i))-1);
                }
            }

            if(st.reverse().toString().equals(t)){

                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
