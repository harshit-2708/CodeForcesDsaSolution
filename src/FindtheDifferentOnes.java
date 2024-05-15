import java.util.*;

public class FindtheDifferentOnes {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int o=0;o<t;o++){
            int n=sc.nextInt();
            Map<Integer, List<Integer>> a =new HashMap<>();
            for(int i=0;i<n;i++){
                int b=sc.nextInt();
                a.putIfAbsent(b,new ArrayList<>());
                a.get(b).add(i+1);
            }
            int q=sc.nextInt();
            for(int i=0;i<q;i++){
                int c=sc.nextInt();
                int d=sc.nextInt();
                int x=-1,y=-1;
                for(Integer key:a.keySet()){
                    int e = Collections.binarySearch(a.get(key), d);
                    if (e < 0) {
                        e = -(e + 1) - 1;
                    }
                    if(e<0){
                        continue;
                    }
                    e=a.get(key).get(e);
                    if(e>=c){
                        if(x==-1){
                            x=e;
                        }else if(x!=-1){
                            y=e;
                            break;
                        }
                    }
                }
                if(x==-1||y==-1){
                    System.out.println(-1+" "+-1);
                }else {
                    if(x>y){
                        System.out.println(y+ " "+x);
                    }else {
                        System.out.println(x + " " + y);
                    }
                }
            }
            System.out.println();
        }
    }

    int indexedBinarySearch(List<Integer> list, int key) {
        int low = 0;
        int high = list.size()-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Integer midVal = list.get(mid);
            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found
    }


}
