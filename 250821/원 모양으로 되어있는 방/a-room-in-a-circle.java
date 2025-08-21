import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] roomNum = new int[n];

        for (int i = 0; i < n; i++) {
            roomNum[i] = Integer.parseInt(br.readLine());
        }

        // System.out.println(Arrays.toString(roomNum));

        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 1; i++) { // 사람이 모인 위치
            int totalDist = 0;
            int idx = i;
            for (int j = 1; j <= n - 1; j++) { // 거리 합산                
                totalDist += roomNum[(i + j) % n] * j;
            }

            minDist = Math.min(minDist, totalDist);
        }

        System.out.println(minDist);
    }
}