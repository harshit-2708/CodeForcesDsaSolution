import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoringSubsequences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            List<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(sc.nextInt());
            }
            for(int i=0;i<n;i++) {
                int max = a.get(i);
                int ans = 1;
                int fac = 1;
                int flag=0;
                for (int j = i; j >=0; j--) {
                    ans = ans * a.get(j);
                    fac = fac * ( i-j+ 1);
                    if ((ans / fac) >= max) {
                        max=ans/fac;
                    }else {
                        flag=1;
                        System.out.print(i - j+ " ");
                        break;
                    }
                }
                if(flag==0){
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }
    }
}
