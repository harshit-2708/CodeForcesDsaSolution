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

            for(int i=0;i<n;i++){
                ans[i]=new Pair();
                ans[i].a=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                ans[i].b=sc.nextInt();
            }
            Arrays.sort(ans, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return (int) (o1.b-o2.b);
                }
            });
            long res= p,j=1;
            for(int i = 0; i< n; i++){
                if(ans[i].b< p) {
                    if (ans[i].a + j >= n) {
                        res += (ans[i].b) * (n - j);
                        j+= ans[i].a;
                        break;
                    } else {
                        j += ans[i].a;
                        res += (ans[i].a * ans[i].b);
                    }
                }
                else{
                    break;
                }
            }
            if(n -j>0){
                res+=(n -j)* p;
            }
            System.out.println(res);
        }

    }

    static class Pair{
        long a;
        long b;

        Pair(){

        }
    }
}
