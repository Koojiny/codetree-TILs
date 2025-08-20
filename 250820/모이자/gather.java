import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] house = new int[n + 1];

        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            house[i] = Integer.parseInt(st.nextToken());
        }

        // System.out.println(Arrays.toString(house));

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int curSum = 0;
            for (int j = 1; j <= n; j++) {
                // if (i == j) continue;
                curSum += Math.abs(i - j) * house[j];
            }
            // System.out.println(i +"번째 : " +curSum);
            min = Math.min(min, curSum);
        }

        System.out.println(min);
    }
}