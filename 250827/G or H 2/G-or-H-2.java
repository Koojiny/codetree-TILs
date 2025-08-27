import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int maxSize = 101;
        char[] line = new char[maxSize];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int position = Integer.parseInt(st.nextToken());
            char alphabet = st.nextToken().charAt(0);

            line[position] = alphabet;
        }

        // System.out.println(Arrays.toString(line));

        int answer = 0;
        for (int start = 0; start < maxSize; start++) { // 시작점            
            for (int end = start; end < maxSize; end++) { // 끝점
                if (line[start] == 0 || line[end] == 0) continue; // 시작점과 끝점에 사람이 있어야한다!
                
                int gCnt = 0;
                int hCnt = 0;
                
                for (int k = start; k <= end; k++) { // 시작점부터 끝점까지 모두 확인
                    if (line[k] == 'G') gCnt++;
                    if (line[k] == 'H') hCnt++;
                }

                // 구간 내에 조건을 만족한다면 구간 길이와 최댓값을 비교
                if (gCnt == hCnt || gCnt == 0 || hCnt == 0) { // G로만 혹은 H로만 이루어져있거나, 둘의 개수가 동일한 경우
                    int length = end - start;
                    answer = Math.max(answer, length);
                    // System.out.println("g = " + gCnt + ", h = " + hCnt + ", length = " + length);
                }
            }
        }

        if (n == 1) answer = 0;

        System.out.println(answer);
    }
}