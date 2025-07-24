import java.util.*;
public class DijkatrasAlgorithm {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creategraph(ArrayList<Edge>[]graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
      //  graph[0].add(new Edge(0,3));
        //vertex
        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));
        //graph[1].add(new edge(1,3,3));
        //2-vertex
        graph[2].add(new Edge(2,4,3));
      //  graph[2].add(new Edge(2,1));
      //  graph[2].add(new edge(2,4,4));
        //3-vertex
        graph[3].add(new Edge(3,5,1));
      //  graph[3].add(new Edge(3,4));
       // graph[3].add(new Edge(3,5));

        //4-vertex
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
      //  graph[4].add(new Edge(4,3));
       // graph[4].add(new Edge(2,5));
    }
    static class pair implements Comparable<pair>{
        int n;
        int path;
        public pair(int n,int path){
            this.n = n;
            this.path = path;
        }
        @Override
        public int compareTo(pair P2){
            return this.path-P2.path;
        }
       
            
    }
    public static void DijkatrasAlgorithm(ArrayList<Edge>graph[],int src){
        int dist[] = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]  = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<pair>pq = new PriorityQueue<>();
        pq.add(new pair(src,0));
       while(!pq.isEmpty()){
        pair curr = pq.remove();
        if(!vis[curr.n]);
        vis[curr.n] = true;
        for(int i=0;i<graph[curr.n].size();i++){
            Edge e = graph[curr.n].get(i);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;
            if(dist[u]+wt<dist[v]){
                dist[v] = dist[u]+wt;
                pq.add(new pair(v,dist[v]));
            }
        }
       }
       for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");

    }
    System.out.println();
    }
    public static void main(String args[]){
        int v=6;
        //int arr[] = 
        ArrayList<Edge>graph[] = new ArrayList[v];
        
        creategraph(graph);
        //  bfs(graph);
        int src = 0;
        DijkatrasAlgorithm(graph,src);
        //System.out.println(HashPath(graph, 0, 5, new boolean[v]));
      
    }
}