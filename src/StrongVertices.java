import java.util.*;

public class StrongVertices {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0){
            int b=sc.nextInt();
            int[] c=new int[b];
            int[] d=new int[b];
            for(int i=0;i<b;i++){
                c[i]=sc.nextInt();
            }
            for(int i=0;i<b;i++){
                d[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<b;i++){
                max=Math.max(max,c[i]-d[i]);
            }
            int e=0;
            for(int i=0;i<b;i++){
                if(c[i]-d[i]==max){
                    e++;
                }
            }
            System.out.println(e);
            for(int i=0;i<b;i++){
                if(c[i]-d[i]==max){
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }

    }

//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        while(a-->0){
//            int b=sc.nextInt();
//            int[] c=new int[b];
//            int[] d=new int[b];
//            for(int i=0;i<b;i++){
//                c[i]=sc.nextInt();
//            }
//            for(int i=0;i<b;i++){
//                d[i]=sc.nextInt();
//            }
//            List<List<Integer>> graph=new ArrayList<>();
//            for(int i=0;i<b;i++){
//                graph.add(new ArrayList<>());
//            }
//            int[] out=new int[b];
//            int ind=0;
//            int max=0;
//            for(int i=0;i<b;i++){
//                for(int j=i+1;j<b;j++){
//                    int x=c[i]-c[j];
//                    int y=d[i]-d[j];
//                    if(x>y) {
//                        graph.get(i).add(j);
//                        out[i]+=1;
//                    }else if(x==y){
//                       graph.get(i).add(j);
//                       graph.get(j).add(i);
//                        out[i]+=1;
//                        out[j]+=1;
//                    }else{
//                        graph.get(j).add(i);
//                        out[j]+=1;
//                    }
//                }
//                if(out[i]>max){
//                    max=out[i];
//                    ind=i;
//                }
//            }
//            List<Integer> ans=new ArrayList<>();
//            int[] vis=new int[b];
//            Arrays.fill(vis,0);
//            dfs(graph,ind,ans,vis);
//            List<Integer> fin=new ArrayList<>();
//            fin.add(ans.get(0));
//            for(int i=1;i<ans.size();i++){
//                if(graph.get(ans.get(i)).contains(ans.get(0))){
//                    fin.add(ans.get(i));
//                }
//            }
//            Collections.sort(fin);
//            System.out.println(fin.size());
//            for(int i=0;i<fin.size();i++){
//                System.out.print(fin.get(i)+1+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    static void dfs(List<List<Integer>> graph,int ind,List<Integer> c,int[] vis){
//        c.add(ind);
//        for(Integer d:graph.get(ind)){
//            if(vis[d]==0){
//                vis[d]=1;
//                dfs(graph,d,c,vis);
//            }
//        }
//    }
}
