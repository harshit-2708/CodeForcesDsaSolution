import java.util.Scanner;

public class TenzingAndBooks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int[] c=new int[n];
            scanArray(a,n,sc);
            scanArray(b,n,sc);
            scanArray(c,n,sc);
            int[] ans=new int[1];
            check(a,n,x,ans);
            check(b,n,x,ans);
            check(c,n,x,ans);
            if(ans[0]==x){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }
    }

    static void check(int[] a,int n,int x,int[] ans){
        for(int i=0;i<n;i++){
            if((a[i]|x)>x){
                break;
            }
            ans[0]=ans[0]|a[i];
        }
    }
    static void scanArray(int[] a,int n, Scanner sc){
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}
