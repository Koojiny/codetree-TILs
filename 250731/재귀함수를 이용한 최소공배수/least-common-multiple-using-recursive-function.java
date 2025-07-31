import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 1;
        for (int i : arr) {
            result = (i * result) / gcd(i, result);
        }

        System.out.print(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}