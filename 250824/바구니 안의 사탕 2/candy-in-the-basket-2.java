import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] basket = new int[101];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());

            basket[idx] = candy;
        }

        int max = 0;
        for (int i = 0 + k; i < basket.length - k; i++) { // 시작 중심점 위치
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) { // c - K 부터 c + K 까지만큼 합산
                sum += basket[j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}