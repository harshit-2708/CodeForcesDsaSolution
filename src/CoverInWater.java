import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b=sc.nextInt();
            String c=sc.next();
            int ans=0;
            int max=0;
            int as=0;
            for(int i=0;i<b;i++){
                if(c.charAt(i)=='.'){
                   ans+=1;
                   as+=1;
                }else{
                    ans=0;
                }
                max=Math.max(max,ans);
            }
            if(max>2){
                System.out.println(2);
            }else {
                System.out.println(as);
            }
        }
    }
}
