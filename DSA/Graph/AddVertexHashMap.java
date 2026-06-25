package DSA.Graph;

import java.util.*;

record Edge(int node ,int weight){};

public class AddVertexHashMap {
    HashMap<Integer,List<Edge>> adjMap;

    AddVertexHashMap(){
        adjMap = new HashMap<>();
    }

    public void addEdge(int u, int v, int w){
        adjMap.putIfAbsent(u,new ArrayList<>());
        adjMap.putIfAbsent(v, new ArrayList<>());
        adjMap.get(u).add(new Edge(v, w));
        adjMap.get(u).add(new Edge(w,v));   // undirected
    }

    public void addVertex(int v){
        adjMap.putIfAbsent(v, new ArrayList<>());
    }

    public void printgraph(){
        for(int v :  adjMap.keySet()){
            System.out.println(v+"-->"+ adjMap.get(v));
        }
    }

    public static void main(String[] args) {
        AddVertexHashMap graph = new AddVertexHashMap();

        graph.addEdge(0,1,34);
        graph.addEdge(0,2,22);
        graph.addEdge(1,3,33);
        graph.addEdge(0,3,44);
        graph.printgraph();

        System.out.println("-----------------  After addvertex   =============");
        graph.addVertex(6);
        graph.addEdge(6,0,66);
        graph.printgraph();
    }
}
