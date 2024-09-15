import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        // N * N 크기 격자 정보 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(arr));
        int maxMoney = 0;

        // 격자 순회하면서 1 * 3 크기의 격자로 동전 개수 체크
        for (int i = 0; i < n; i++) {                        
            for (int j = 0; j < n - 2; j++) {
                int tmpSum = 0;
                tmpSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                //System.out.print(i + "행" + j + "열 ");
                maxMoney = Math.max(maxMoney, tmpSum);
                //System.out.print(maxMoney + " " + tmpSum);
            }                       
            //System.out.println();
        }

        System.out.print(maxMoney);
    }
}