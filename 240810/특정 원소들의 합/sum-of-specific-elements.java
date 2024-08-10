import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 0;
        int sum = 0;

        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                sum += arr[i][j];
            }
            cnt++;
        }

        System.out.print(sum);
    }
}