package TNP_Techmical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Flatland_Space_Station {
    public static int FlatlandStation(int m, int[] stations) {
        Arrays.sort(stations);
        int max_dis = 0;

        // Distance from the first city to the first station
        max_dis = Math.max(max_dis, stations[0]);

        // Distance between consecutive stations
        for (int i = 1; i < stations.length; i++) {
            max_dis = Math.max(max_dis, (stations[i] - stations[i - 1]) / 2);
        }

        // Distance from the last station to the last city
        max_dis = Math.max(max_dis, m - 1 - stations[stations.length - 1]);

        return max_dis;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]); // Number of cities
        int n = Integer.parseInt(input[1]); // Number of space stations

        String[] secondInput = br.readLine().split(" ");
        int[] stations = new int[n];
        for (int i = 0; i < n; i++) {
            stations[i] = Integer.parseInt(secondInput[i]);
        }
        System.out.println(FlatlandStation(m, stations));
    }
}
