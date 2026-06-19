package DSA.Graph;

import java.util.ArrayList;

public class DirectedGraphAdjList {
    // private ArrayList<AbstractMap.SimpleEntry<Integer,Integer>>[] adjList;
    private ArrayList<Integer>[] adjList;
    private int vertices;

    public DirectedGraphAdjList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new ArrayList<>();
        } 
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        

        // adjList[u].add(new Edge(v,w));
        // adjList[v].add(new Edge(u,w));
        // adjList[u].add(new AbstractMap.SimpleEntry<>(v,w));
        // adjList[v].add(new AbstractMap.SimpleEntry<>(u,w));
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ----> ");
            System.out.println(adjList[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DirectedGraphAdjList graph = new DirectedGraphAdjList(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(3,1);
        graph.addEdge(3, 2);
        graph.addEdge(5, 3);

        // graph.addEdge(0, 1,10);
        // graph.addEdge(0, 3,3);
        // graph.addEdge(1, 2,6);
        // graph.addEdge(1, 3,78);
        // graph.addEdge(2, 3,34);
        // graph.addEdge(2, 4,35);
        // graph.addEdge(3, 5,67);

        graph.printGraph();

    }
}
