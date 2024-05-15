import java.util.Scanner;

public class GameWithIntegers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b=sc.nextInt();
            if(b%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
    }
}
