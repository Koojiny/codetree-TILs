import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] xArr = new int[n];
        int[] yArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xArr[i] = x;
            yArr[i] = y;
        }

        int minDis = Integer.MAX_VALUE;
        int prevIdx = 0;
        for (int i = 1; i < n - 1; i++) { // 1번과 N번을 제외한 체크포인트를 건너뛰게 하는 범위 설정
            int totalDist = 0;
            // System.out.println("i = " + i);
            for(int j = 0; j < n; j++) { // 한 곳을 제외한 전체 거리 합산
                if (i == j) continue;

                totalDist += Math.abs(xArr[j] - xArr[prevIdx]) + Math.abs(yArr[j] - yArr[prevIdx]);
                prevIdx = j;
                // System.out.println("j = " + j +", prevIdx = " + prevIdx + ", totalDist = " + totalDist);
                // System.out.println("x : " + xArr[j] + " " + xArr[prevIdx]);
                // System.out.println("y : " + yArr[j] + " " + yArr[prevIdx]);
            }
            // System.out.println();

            minDis = Math.min(minDis, totalDist);
        }

        System.out.println(minDis);
    }
}