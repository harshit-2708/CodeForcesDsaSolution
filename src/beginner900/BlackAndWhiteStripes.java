package beginner900;

import java.util.Scanner;

public class BlackAndWhiteStripes {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int no=0;
            int min=0;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W'){
                    no++;
                }
            }
            min=no;
            for(int i=k;i<n;i++){
                if(s.charAt(i-k)=='W'){
                    no--;
                }
                if(s.charAt(i)=='W'){
                    no++;
                }
                min=Math.min(min,no);
            }
            System.out.println(min);
        }
    }
}
