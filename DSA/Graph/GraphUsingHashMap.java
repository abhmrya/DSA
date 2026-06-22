package DSA.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

record Edge(int node,int weight){}

public class GraphUsingHashMap {
    // private HashMap<Integer,List<Integer>> adjMap;
    private HashMap<Integer,List<Edge>> adjMap;
    GraphUsingHashMap(){
        adjMap = new HashMap<>();
    }

    public void addEdge(int u , int v,int w){
        adjMap.putIfAbsent(u, new ArrayList<>());
        adjMap.putIfAbsent(v, new ArrayList<>());

        // undirected graph 


        // adjMap.get(u).add(v);
        // adjMap.get(v).add(u);

        // adjMap.get(u).add(new Edge(v,w));
        // adjMap.get(v).add(new Edge(u,w));

        // directed graph
        adjMap.get(u).add(new Edge(v,w));
    }

    public void printGraph(){
        for(int v : adjMap.keySet()){
            System.out.println(v + "-->"+adjMap.get(v));
        }
    }

    public static void main(String[] args){
        GraphUsingHashMap graph = new GraphUsingHashMap();
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(0, 3);
        // graph.printGraph();

        graph.addEdge(0, 1,34);
        graph.addEdge(0, 2,22);
        graph.addEdge(1, 3,33);
        graph.addEdge(0, 3,44);
        graph.printGraph();
    }
}
