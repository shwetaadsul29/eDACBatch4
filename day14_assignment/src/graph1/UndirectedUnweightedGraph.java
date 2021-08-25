package graph1;

import java.util.Iterator;
import java.util.LinkedList;

public class UndirectedUnweightedGraph implements UnweightedGraphIntf {


    private int Vertices;   // No. of vertices 
    private LinkedList<Integer> adj_list[]; //Adjacency Lists 
   
    // graph Constructor:number of vertices in graph are passed 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	UndirectedUnweightedGraph(int v) { 
        Vertices = v; 
        adj_list = new LinkedList[v]; 
        for (int i=0; i<v; ++i)         //create adjacency lists
            adj_list[i] = new LinkedList(); 
    } 
   
    // add an edge to the graph 
    @Override
   public void addEdge(int v,int w) { 
        adj_list[v].add(w); 
    } 
   
    // BFS traversal from the root_node 
    @Override
	public int[] BFS(int root_node)   { 
        // initially all vertices are not visited 
        boolean visited[] = new boolean[Vertices]; 
   
        // BFS queue 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
   
        // current node = visited, insert into queue 
        visited[root_node]=true; 
        queue.add(root_node); 
   
        while (queue.size() != 0)  { 
            // deque an entry from queue and process it  
            root_node = queue.poll(); 
            System.out.print(root_node+" "); 
   
            // get all adjacent nodes of current node and process
            Iterator<Integer> i = adj_list[root_node].listIterator(); 
            while (i.hasNext()){ 
                int n = i.next(); 
                if (!visited[n]) { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        }
		return null; 
    } 
  }