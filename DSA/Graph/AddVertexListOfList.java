package DSA.Graph;

import java.util.*;

public class AddVertexListOfList {
    private List<List<Integer>>  adjList;
    private int vertices;

    AddVertexListOfList(int vertices){
        this.vertices = vertices;
        this.adjList=new  ArrayList<>();

        for(int i =0; i< vertices;  i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u , int v){
        adjList.get(u).add(v);
    }

    public void printGraph(){
        for(int i =0 ; i< vertices ; i++){
            System.out.print(i+"--->");
            System.out.println(adjList.get(i));
        }
    }

    public void addVertex(int v){
        adjList.add(new ArrayList<>());
        vertices++;
    }


    public static void main(String[] args) {
        AddVertexListOfList graph = new AddVertexListOfList(6);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.printGraph();

        System.out.println("--------- After Adding ------------------");
        graph.addVertex(6);
        graph.addEdge(6, 0);
        graph.printGraph();
    }
}
