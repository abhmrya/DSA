package DSA.Graph;

import java.util.*;

public class UndirectedGraphListOfList {
    private List<List<Integer>> adjList;
    private int vertices;

    UndirectedGraphListOfList(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>();

        for(int i =0 ; i<vertices ; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u ,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ----> ");
            System.out.println(adjList.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UndirectedGraphListOfList graph = new UndirectedGraphListOfList(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(3,1);
        graph.addEdge(3, 2);
        graph.addEdge(5, 3);

        graph.printGraph();

    }
}
