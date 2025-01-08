import java.util.Arrays;

public class L787_CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Bellman Ford Algorithm
        int[] prices = new int[n];
        Arrays.fill(prices,Integer.MAX_VALUE);
        prices[src] = 0;

        for (int i = 0; i <= k; i++){
            int[] tempPrices = Arrays.copyOf(prices,n);

            for (int[] flight : flights){
                int s = flight[0];
                int d = flight[1];
                int p = flight[2];

                if (prices[s] == Integer.MAX_VALUE) continue;

                if (prices[s] + p < tempPrices[d]){
                    tempPrices[d] = prices[s] + p;
                }
            }

            prices = tempPrices;
        }

        return prices[dst] == Integer.MAX_VALUE ? -1:prices[dst];
    }
}
