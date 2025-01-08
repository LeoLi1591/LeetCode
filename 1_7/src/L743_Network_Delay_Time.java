import java.util.Arrays;

public class L743_Network_Delay_Time {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Bellmen Ford
        // find shortest path
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k - 1] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int[] time : times) {
                int u = time[0] - 1, v = time[1] - 1, w = time[2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        int maxDist = Arrays.stream(dist).max().getAsInt();
        return maxDist == Integer.MAX_VALUE ? -1 : maxDist;
    }
}
