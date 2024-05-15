import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HelmetsinNightLight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            int p=sc.nextInt();
            Pair[] ans=new Pair[n];
            Arrays.sort(ans, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.b-o2.b;
                }
            });
            int res=0;
            for(int i=0;i<n;i++){
                res+=
            }
        }

    }

    class Pair{
        int a;
        int b;
    }
}
