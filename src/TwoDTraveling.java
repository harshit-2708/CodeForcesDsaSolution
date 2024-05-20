import java.util.Scanner;

public class TwoDTraveling {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            a--;
            b--;
            Pair[] co=new Pair[n];
            for(int i=0;i<n;i++){
                co[i]=new Pair(sc.nextLong(),sc.nextLong());
            }

            long ans=Math.abs(co[a].x-co[b].x)+Math.abs(co[a].y-co[b].y);
            long left=Long.MAX_VALUE/2;
            long right=Long.MAX_VALUE/2;
            for (int i = 0; i < k; i++) {
                long s=Math.abs(co[a].x-co[i].x)+Math.abs(co[a].y-co[i].y);
                if(s<left){
                    left=s;
                }
            }
            for(int i=0;i<k;i++){
                long s=Math.abs(co[b].x-co[i].x)+Math.abs(co[b].y-co[i].y);
                if(s<right){
                    right=s;
                }
            }
            if(left+right<ans){
                ans=left+right;
            }
            System.out.println(ans);
        }
    }

    static class Pair{
        long x,y;
        Pair(long x,long y){
            this.x=x;
            this.y=y;
        }
    }
}
