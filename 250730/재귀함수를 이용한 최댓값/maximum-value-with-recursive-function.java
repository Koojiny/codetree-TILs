import java.util.*;
import java.io.*;

public class Main {
    public static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        max = Integer.MIN_VALUE;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        maxValue(arr, 0);

        System.out.print(max);
    }

    public static int maxValue(int[] arr, int n) {
        if (n == arr.length) return 0;
        if (max < arr[n]) max = arr[n];

        return maxValue(arr, n + 1);
    }
}