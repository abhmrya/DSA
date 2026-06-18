package DSA.Graph;

public class AdjacencyMatrix {
    private int[][] matrix;
    private int vertices;

    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];

        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                matrix[i][j]=-1;
            }
        }
    }


// Undirected Unweighted grauph
    // public void addEdge(int startVertex , int endVertex){
    //     matrix[startVertex][endVertex]=1;
    //     matrix[endVertex][startVertex]=1;
    // }

// // directed unweighted graph
//     public void addDirectedEdge(int startVertex , int endVertex){
//         matrix[startVertex][endVertex]=1;
//     }

// directed weighted graph
    public void addDirectedWeightEdge(int startVertex , int endVertex,int weight){
        matrix[startVertex][endVertex]=weight;
    }

    public void addEdge(int startVertex , int endVertex,int weight){
        matrix[startVertex][endVertex]=weight;
        matrix[endVertex][startVertex]=weight;
    }

    public void printMatric(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        AdjacencyMatrix graph = new AdjacencyMatrix(6);
        // graph.addEdge(0,1,10);
        // graph.addEdge(0,3,12);
        // graph.addEdge(1,2,6);
        // graph.addEdge(1,3,7);
        // graph.addEdge(2,3);
        // graph.addEdge(2,4);
        // graph.addEdge(3,5);

        // graph.addDirectedEdge(0,1);
        // graph.addDirectedEdge(1, 3);
        // graph.addDirectedEdge(2, 5);

        graph.addDirectedWeightEdge(0,1,5);
        graph.addDirectedWeightEdge(1, 3,7);
        graph.addDirectedWeightEdge(2, 5,89);

        graph.printMatric();

    }

    
}
