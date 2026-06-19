package DSA.Graph;

import java.util.AbstractMap;
import java.util.ArrayList;

// class Pair {
//     int node;
//     int weight;

//     Pair(int node, int weight) {
//         this.node = node;
//         this.weight = weight;
//     }

//     @Override
//     public String toString() {
//         return "(" + node + "," + weight + ")";
//     }
// }

// record Edge(int node , int weight){}

public class UndirectedAdjList {
    // private ArrayList<Integer>[] adjList;

    // private ArrayList<Pair>[] adjList;

    // private ArrayList<Edge>[] adjList;

    private ArrayList<AbstractMap.SimpleEntry<Integer,Integer>>[] adjList;
    private int vertices;

    public UndirectedAdjList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v,int w) {
        // adjList[u].add(new Edge(v,w));
        // adjList[v].add(new Edge(u,w));
        adjList[u].add(new AbstractMap.SimpleEntry<>(v,w));
        adjList[v].add(new AbstractMap.SimpleEntry<>(u,w));
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ----> ");
            System.out.println(adjList[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UndirectedAdjList graph = new UndirectedAdjList(6);
        graph.addEdge(0, 1,10);
        graph.addEdge(0, 3,3);
        graph.addEdge(1, 2,6);
        graph.addEdge(1, 3,78);
        graph.addEdge(2, 3,34);
        graph.addEdge(2, 4,35);
        graph.addEdge(3, 5,67);

        graph.printGraph();

    }
}
