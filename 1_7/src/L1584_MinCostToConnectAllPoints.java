import java.util.Arrays;

public class L1584_MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        // Prim Algo
        // Minimum cost in weighted graph
        int n = points.length;
        int node = 0;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int edges = 0;
        int res = 0;

        while (edges<n -1){
            visited[node] = true;
            int nextNode = -1;
            for (int i = 0; i < n; i++){
                if (visited[i]){
                    continue;
                }

                int curDist = Math.abs(points[i][0] - points[node][0]) +
                            Math.abs(points[i][1] - points[node][1]);

                dist[i] = Math.min(dist[i],curDist);
                if (nextNode == -1 || dist[i] < dist[nextNode]){
                    nextNode = i;
                }
            }

            res+= dist[nextNode];
            node = nextNode;
            edges++;
        }

        return res;
    }
}
