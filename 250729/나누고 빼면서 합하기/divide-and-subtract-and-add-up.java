import java.util.*;
import java.io.*;

public class Main {
    public static int M, N, result;
    public static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        calc();
        System.out.println(result);
    }

    public static void calc() {
        while (true) {
            result += arr[M - 1];
            if (M == 1) break;

            if (M % 2 == 1) {
                M -= 1;
            } else {
                M /= 2;
            }
        }
    }
}