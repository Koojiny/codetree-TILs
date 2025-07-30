import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static int[][] dist;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dist = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dist[i][0] = Integer.parseInt(st.nextToken());
            dist[i][1] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 1; i < N - 1; i++) { // i는 생략할 체크포인트 인덱스 (1 <= i <= n-2 양끝 제외한 모든 인덱스)
            int distance = 0; // 거리 누적 합
            int prevIdx = 0; // 이전 방문 지점의 인덱스
            for (int j = 1; j < N; j++) {
                if (i == j) continue;
                distance += Math.abs(dist[prevIdx][0] - dist[j][0]) + Math.abs(dist[prevIdx][1] - dist[j][1]);
                prevIdx = j; // 방문했다면 현재 방문 지점 인덱스 업데이트
            }
            answer = Math.min(answer, distance); // 누적거리 합산이 끝난 경우, 현재 누적합과 기존 최소누적거리와 비교
        }

        System.out.println(answer);
    }
}