import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int student = Integer.parseInt(br.readLine());
            arr[student]++;
            if (arr[student] == k) {
                System.out.println(student);
                return;
            }
        }

        System.out.println(-1);
    }
}