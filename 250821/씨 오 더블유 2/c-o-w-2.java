import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] cows = br.readLine().toCharArray();

        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (cows[i] == 'C' && cows[j] == 'O' && cows[k] == 'W') cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}