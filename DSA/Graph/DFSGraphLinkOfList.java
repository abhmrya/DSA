package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DFSGraphLinkOfList {
    private List<List<Integer>> adjList;
    private int vertices;

    DFSGraphLinkOfList(int vertices){
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

    List<Integer> dfsTraverse(int start){
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[adjList.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                // System.out.println(u+" ");
                list.add(u);
                for(int i : adjList.get(u)){
                    if(!visited[i]){
                        stack.push(i);
                    }
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
        DFSGraphLinkOfList graph = new DFSGraphLinkOfList(6);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(3, 0);
        graph.addEdge(3,1);
        graph.addEdge(3, 2);
        graph.addEdge(5, 3);
        graph.printGraph();

        // graph.bsfTraverse(0);

        System.out.println("BFS Traversal using Queue : " + graph.bsfTraverse(0));

        // graph.dfsTraverse(0);
        System.out.println("DFS Traversal Using Stack : "+ graph.dfsTraverse(0));


    }
}
