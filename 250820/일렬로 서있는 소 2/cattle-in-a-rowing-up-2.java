import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cows = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if (cows[i] <= cows[j] && cows[j] <= cows[k]) {
                        cnt++;
                        // System.out.println(i + " " + j + " " + k);
                        // System.out.println(cows[i] + " " + cows[j] + " " + cows[k]);
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}