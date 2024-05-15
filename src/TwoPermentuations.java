import java.util.Scanner;

public class TwoPermentuations {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(b-(c+d)>=2){
                System.out.println("Yes");
            }else{
                if(d==c&&b==c){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}
