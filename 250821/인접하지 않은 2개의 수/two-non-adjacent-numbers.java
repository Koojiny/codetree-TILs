import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i -j) <= 1) continue;
                int sum = arr[i] + arr[j];
                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}