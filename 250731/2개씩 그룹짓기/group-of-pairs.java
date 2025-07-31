import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2 * n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = arr[i] + arr[2 * n - i - 1];
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}