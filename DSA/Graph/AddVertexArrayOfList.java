package DSA.Graph;

import java.util.*;

public class AddVertexArrayOfList {
    private ArrayList<Integer>[] adjList;
    private int vertices;

    public AddVertexArrayOfList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList[vertices];

        for(int i =0; i< vertices; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u , int v){
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public void addVertex(int v){
        ArrayList<Integer>[] newAdj = new ArrayList[vertices+1];
        for(int i= 0; i<vertices ; i++){
            newAdj[i] = adjList[i];
        }
        newAdj[vertices] = new ArrayList<>();
        adjList  = newAdj;
        vertices++;
    }

    public void printGraph(){
        for(int i =0; i<vertices; i++){
            System.out.print(i+ " -----> ");
            System.out.println(adjList[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddVertexArrayOfList graph = new AddVertexArrayOfList(6);
        graph.addEdge(0,1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2,4);
        graph.addEdge(3, 5);
        graph.printGraph();
        graph.addVertex(6);
        graph.addEdge(6, 0);

        System.out.println("-----------------------");
        graph.printGraph();
    }

    

}
