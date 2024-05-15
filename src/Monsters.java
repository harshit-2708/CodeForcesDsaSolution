import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Monsters {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            PriorityQueue<Monster> c=new PriorityQueue<>(new Comparator<Monster>() {
                @Override
                public int compare(Monster o1, Monster o2) {
                    if(o1.a==o2.a){
                        return o1.b-o2.b;
                    }
                    return o2.a-o1.a;
                }
            });
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                c.offer(new Monster((x%k)==0?k:x%k,i+1));
            }
            while(!c.isEmpty()){
                Monster m=c.poll();
                m.a-=k;
                if(m.a<=0){
                    System.out.print(m.b+" ");
                }else{
                    c.offer(m);
                }
            }
            System.out.println();
        }
    }

    public static class Monster{
        int a;
        int b;
        Monster(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}
