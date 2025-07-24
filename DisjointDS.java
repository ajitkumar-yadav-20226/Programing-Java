import java.util.*;
public class DisjointDS {
    static int n=7;
    static int pair[] = new int[n];
    static int rank[] = new int[n];
    public static void init(){
        for(int i=0;i<n;i++){
            pair[i] = i;
        }
    }
    public static int find(int x){
        if(x==pair[x]){
            return x;
        }
        return find(pair[x]);
    }
    public static void union(int a,int b){
        int pairA = find(a);
        int pairB = find(b);
        if(rank[pairA]==rank[pairB]){
            pair[pairB] = pairA;
            rank[pairA]++;
        }
        else if(rank[pairA]<rank[pairB]){
            pair[pairA] = pairB;
        }
        else{
            pair[pairB] = pairA;
        }
    }
    public static void main(String args[]){
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(3);
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1,5);
    }
}
