import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
    
        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 같은 수를 정한 경우는 건너뜀
                if (i == j) continue;
                
                // 전체 합에서 2개 숫자를 제외한 합을 구함
                int num = sum - arr[i] - arr[j];

                // S와의 차이를 구하고 차이가 diff보다 작다면 diff 초기화
                int curDiff = Math.abs(s - num);
                diff = Math.min(diff, curDiff);
            }
        }

        System.out.println(diff);
    }
}