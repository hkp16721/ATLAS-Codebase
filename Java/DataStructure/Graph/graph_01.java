package DataStructure.Graph;

class graph_node{
    int node_count;
    int[][] value_metrix;
    public graph_node(int node_count){
        this.node_count = node_count;
        this.value_metrix = new int[node_count][node_count];
    }
    public void add_edges(int u, int v) {
        if (u >= 0 && u < node_count && v >= 0 && v < node_count) {
            value_metrix[u][v] = 1;
        } else {
            System.out.println("Invalid vertices");
        }
    }
    public void printGraph() {
        System.out.println("Adjacency Matrix Representation:");
        System.out.print("   ");
        for (int i = 0; i < node_count; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("   _ _ _ _ _");
        for (int i = 0; i < node_count; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < node_count; j++) {
                System.out.print(value_metrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
public class graph_01 {
    public static void main(String[] args) {
        graph_node grf = new graph_node(5);
        grf.add_edges(1,2);
        grf.add_edges(1,3);
        grf.add_edges(1,4);
        grf.add_edges(2,4);
        grf.add_edges(2,5);
        grf.printGraph();

    }
}
