import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        int[] b = new int[m];
        int[] temp = new int[n]; // 배열 A 복사할 임시 배열 생성

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 임시 배열과 비교를 위해 배열 B 정렬
        Arrays.sort(b, 0, m);

        int answer = 0;
        for (int i = 0; i <= n - m; i++) { // 모든 구간의 시작점을 잡는다
            for (int j = 0; j < m; j++) { // 현재 위치 i에서 M개만큼 복사
                temp[j] = a[i + j];
            }

            Arrays.sort(temp, 0, m);

            boolean isSame = true;
            for (int j = 0; j < m; j++) {
                if (temp[j] != b[j]) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) answer++;
        }

        System.out.println(answer);
    }
}