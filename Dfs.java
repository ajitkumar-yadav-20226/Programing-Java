import java.util.*;
public class Dfs {
    static class Edge{
        int src;
        int d;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.d = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        //vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        //graph[1].add(new edge(1,3,3));
        //2-vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
      //  graph[2].add(new edge(2,4,4));
        //3-vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4-vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(2,5,1));

        //5-vertex
        graph[5].add(new Edge(6,5,1));    
        graph[5].add(new Edge(5,4,1));    
        graph[5].add(new Edge(4,6,1));    
    }
    public static void dfs(ArrayList<Edge>[]graph,int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.d]){
                dfs(graph,e.d,vis);
            }
        }
    }
    public static void main(String args[]){
        int v=5;
        //int arr[] = 
        ArrayList<Edge>graph[] = new ArrayList[v];
        
        createGraph(graph);
        dfs(graph,0,new boolean[v]);
      
    }
}