
package DSA.Graph;

import java.util.*;


public class BSFGraphLinkOfList {
    private List<List<Integer>> adjList;
    private int vertices;

    BSFGraphLinkOfList(int vertices){
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


    List<Integer> bsfTraverse(int start){
        List<Integer> list = new ArrayList<>();
        Queue<Integer>  queue = new LinkedList<>();
        boolean[] visited = new boolean[adjList.size()];

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int u = queue.poll();
            // System.out.println(u+ " ");
            list.add(u);

            for(int neighbour : adjList.get(u)){
                if( visited[neighbour]== false){
                    visited[neighbour]=true;
                    queue.add(neighbour);
                }
            }
        }
        return list;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " ----> ");
            System.out.println(adjList.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BSFGraphLinkOfList graph = new BSFGraphLinkOfList(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(3,1);
        graph.addEdge(3, 2);
        graph.addEdge(5, 3);
        graph.printGraph();

        // graph.bsfTraverse(0);

        System.out.println(graph.bsfTraverse(0));

    }
}
