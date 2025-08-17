import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) { // 시작점
            for (int j = i; j < n; j++) { // 끝점
                int sumValue = 0;
                int numCnt = 0;
                for (int k = i; k <= j; k++) {
                    sumValue += arr[k];
                    numCnt++;
                }

                double avg = (double) sumValue / numCnt;
                for (int k = i; k <= j; k++) {
                    if (avg == arr[k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}