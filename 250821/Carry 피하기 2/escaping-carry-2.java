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

        max = -1;
        int cnt = 0;
        int fullCnt = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    fullCnt++;
                    if (carry(arr[i], arr[j], arr[k])) { // carry 발생한 경우, 합산 후 최대값 비교
                        int sum = arr[i] + arr[j] + arr[k];
                        // System.out.println(arr[i]+ " " + arr[j]+ " " + arr[k]);
                        cnt++;
                        
                        max = Math.max(max, sum);
                    } else { // 한번이라도 carry가 발생하지 않은 경우
                        // System.out.println(arr[i]+ " " + arr[j]+ " " + arr[k]);
                        // flag = true;
                    }
                }
            }
        }
        // System.out.println("cnt = " + cnt + ", fullcnt = " + fullCnt);
        if (cnt == fullCnt) {
            System.out.println(-1);
        } else {
            System.out.println(max);
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