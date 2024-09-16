import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] arr = new char[r][c];
        
        int cnt = 0;    // 경우의 수

        // 2차원 배열 입력 받기
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                arr[i][j] = st.nextToken().charAt(0);
            }
        }

        char tmpC = arr[0][0]; // 시작 위치 값 Flag (이후 W, B 값 바꿔가며 진행)
        // 2차원 배열 순회하며 완전탐색
        // 최소 대각선 오른쪽 아래로 한 칸씩은 이동하고 진행해야 함
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                for (int k = i + 1; k < r - 1; k++) {
                    for (int l = j + 1; l < c - 1; l++) {
                        if (arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[r - 1][c - 1]) cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}