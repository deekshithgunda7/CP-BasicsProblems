import java.util.ArrayList;
import java.util.List;

public class Graph {
    public static List<List<Integer>> createAdjacencyList(int n, int[][] edges) {
        // Initialize the adjacency list with empty lists
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Populate the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // For undirected graph, add both u -> v and v -> u
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        return adjacencyList;
    }

    public static void main(String[] args) {
        int n = 5; // number of nodes
        int[][] edges = {
            {0, 1},
            {0, 4},
            {1, 2},
            {1, 3},
            {1, 4},
            {2, 3},
            {3, 4}
        };

        List<List<Integer>> adjacencyList = createAdjacencyList(n, edges);

        // Print the adjacency list
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("Node " + i + ": ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
