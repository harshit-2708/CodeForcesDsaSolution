import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int[] d=new int[b];
            for(int i=0;i<b;i++){
                d[i]=sc.nextInt();
            }
            int max=d[0]-0;
            for(int i=1;i<b;i++){
                if(max<d[i]-d[i-1]){
                    max=d[i]-d[i-1];
                }
            }
            max=Math.max(max,2*(c-d[b-1]));
            System.out.println(max);
        }
    }
}
