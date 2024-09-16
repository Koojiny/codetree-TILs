import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        // 체크포인트 입력받기
        for (int i = 0; i < n; i++) {
            st= new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        // 체크포인트 순환 : i번째 체크포인트를 건너뛰기
        for (int i = 1; i < n - 1; i++) {
            int distant = 0;
            int prev = 0;
            for (int j = 1; j < n; j++) {
                //System.out.println("i = "+ i + ", j = " + j);
                if (j == i) continue;
                distant += Math.abs(arr[prev][0] - arr[j][0]) + Math.abs(arr[prev][1] - arr[j][1]);
                prev = j;
            }
            answer = Math.min(answer, distant);
            //System.out.println("answer = " + answer);
        }

        System.out.print(answer);
    }
}