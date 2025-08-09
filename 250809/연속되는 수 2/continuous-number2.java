import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 1;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) cnt++;
            else {
                if (cnt > max) max = cnt;
                cnt = 1;
            }
        }

        System.out.println(max);
    }
}