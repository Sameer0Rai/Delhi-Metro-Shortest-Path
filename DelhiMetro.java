package DelhiMetro;
import java.util.Arrays;

public class DelhiMetro {
    // 1) List your stations here:
    static final String[] stations = {
        "Rithala",         // 0
        "Samaypur Badli",  // 1
        "Minor",           // 2
        "Shalimar Bagh",   // 3
        "Azadpur",         // 4
        "Model Town",      // 5
        "Kingsway Camp",   // 6
        "GTB Nagar",       // 7
        "Gudapaar",        // 8
        "Vishwavidyalaya", // 9
        "Vidhan Sabha",    // 10
        "Chandni Chowk"    // 11
    };

    public static void main(String[] args) {
        int N = stations.length;
        int[][] graph = {
            //  0 1 2 3 4 5 6 7 8 9 10 11
            {  0,1,0,0,0,0,0,0,0,0, 0, 0 }, // 0
            {  1,0,1,0,0,0,0,0,0,0, 0, 0 }, // 1
            {  0,1,0,1,0,0,0,0,0,0, 0, 0 }, // 2
            {  0,0,1,0,1,0,0,0,0,0, 0, 0 }, // 3
            {  0,0,0,1,0,1,0,0,0,0, 0, 0 }, // 4
            {  0,0,0,0,1,0,1,0,0,0, 0, 0 }, // 5
            {  0,0,0,0,0,1,0,1,0,0, 0, 0 }, // 6
            {  0,0,0,0,0,0,1,0,1,0, 0, 0 }, // 7
            {  0,0,0,0,0,0,0,1,0,1, 0, 0 }, // 8
            {  0,0,0,0,0,0,0,0,1,0, 1, 0 }, // 9
            {  0,0,0,0,0,0,0,0,0,1, 0, 1 }, // 10
            {  0,0,0,0,0,0,0,0,0,0, 1, 0 }  // 11
        };

        int src = 0;  // or any valid index 0..N-1
        int[] dist = dijkstra(graph, src);

        System.out.println("Shortest hops from " + stations[src] + ":");
        for (int i = 0; i < N; i++) {
            String d = (dist[i] == Integer.MAX_VALUE ? "∞" : String.valueOf(dist[i]));
            System.out.println("  to " + stations[i] + " = " + d);
        }
    }

    // returns array of min distances (in # of hops) from src
    static int[] dijkstra(int[][] graph, int src) {
        int N = graph.length;
        int[] dist = new int[N];
        boolean[] used = new boolean[N];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int it = 0; it < N; it++) {
            // pick unused vertex with smallest dist
            int u = -1, best = Integer.MAX_VALUE;
            for (int v = 0; v < N; v++) {
                if (!used[v] && dist[v] < best) {
                    best = dist[v];
                    u = v;
                }
            }
            if (u == -1) break;
            used[u] = true;

            // relax neighbors
            for (int v = 0; v < N; v++) {
                if (!used[v]
                 && graph[u][v] != 0
                 && dist[u] < Integer.MAX_VALUE
                 && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        return dist;
    }
}
