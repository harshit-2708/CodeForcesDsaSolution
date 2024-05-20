import java.util.Scanner;

public class EatingCandies {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int x=0,y=n-1;
            int left=0,right=0;
            int ans=0;
            while(x<=y){
                if(left==right){
                    ans=x+n-y-1;
                    left+=a[x];
                    x++;
                }
                else if(left<right){
                    left+=a[x];
                    x++;
                }else if(left>right){
                    right+=a[y];
                    y--;
                }
            }
            if(left==right){
                ans=left+n-1-right+((x>y)?1:0);
            }
            System.out.println(ans);
        }
    }
}
