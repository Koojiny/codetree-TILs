import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i % 2 == 0) {
                Arrays.sort(arr, 0, i + 1);
                // System.out.println("idx= " + i + ", " + Arrays.toString(arr));
                System.out.print(arr[i / 2] + " ");
            }
        }
    }
}