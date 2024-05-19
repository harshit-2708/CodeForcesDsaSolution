import java.util.Scanner;

public class GoalsofVictory {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            long ans=0;
            for(int i=0;i<n-1;i++){
                ans+=sc.nextInt();
            }
            System.out.println(-ans);
        }
    }
}
