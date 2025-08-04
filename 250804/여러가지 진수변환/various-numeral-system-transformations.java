import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(changeNum(n, b));
    }

    public static String changeNum(int n, int b) {
        int[] arr = new int[50];
        String result = "";
        int cnt = 0;

        while (true) {
            if (n < b) {
                arr[cnt++] = n;
                break;
            }
            arr[cnt++] = n % b;
            n /= b;
        }
        
        for (int i = cnt - 1; i >= 0; i--) {
            result += arr[i];
        }

        return result;
    }
}