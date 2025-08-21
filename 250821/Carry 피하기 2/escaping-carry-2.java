import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;
    public static int n, max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        max = 0;
        boolean flag = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (carry(arr[i], arr[j], arr[k])) {
                        int sum = arr[i] + arr[j] + arr[k];
                        max = Math.max(max, sum);
                    } else {
                        flag = true; // 한번이라도 carry가 발생한 경우
                    }
                }
            }
        }

        if (flag) {
            System.out.println(max);
        } else {
            System.out.println(-1);
        }
        
    }

    public static boolean carry(int a, int b, int c) {               
        while (a > 0 || b > 0 || c > 0) {
            int curA = a % 10;
            int curB = b % 10;
            int curC = c % 10;

            if (curA + curB + curC < 10) {
                a /= 10;
                b /= 10;
                c /= 10;
            } else {
                return false;
            }
        }

        return true;
    }
}