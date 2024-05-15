import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DivisiblePairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        while (a-->0){
            long n=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            Map<Pair,Long> b=new HashMap<>();
            sc.nextLine();
            String[] input=sc.nextLine().split(" ");
            long ans=0;
            for(int i=0;i<n;i++){
                long c=Long.valueOf(input[i]);
                long p=c%x;
                long q=c%y;
                Pair w=new Pair(p, q);
                Pair z=new Pair((x-p)%x,q);
                if(b.containsKey(z)){
                    ans+=b.get(z);
                }
                    b.put(w, b.getOrDefault(w, 0L)+1);

            }
            System.out.println(ans);
        }
    }
    static class Pair{
        long a;
        long b;
        Pair(long a,long b){
            this.a=a;
            this.b=b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }
}
