import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            String c=sc.next();
            String d=sc.next();
            if(c.equals("g")){
                System.out.println(0);
                continue;
            }
            int flag=0;
            int x=0;
            int max=0;
            for(int i=0;i<a;i++){
                if(d.charAt(i)==c.charAt(0)&&flag==0){
                    flag=1;
                    x=i;

                }
                else if(d.charAt(i)=='g'&&flag==1){
                    if(max<i-x){
                        max=i-x;
                    }

                    flag=0;
                    x=i;
                }
            }
            if(flag==1){
                for(int i=0;i<a;i++){
                    if(d.charAt(i)=='g'){
                        if(max<a-x+i){
                            max=a-x+i;
                        }
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
