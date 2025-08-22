import java.util.*;
import java.io.*;

public class Main {
    public static int[][] board;
    public static int size, winFlag;
    public static int xAns, yAns;
    public static int[] dx = {0, 1, 1, 1}; // → ↘ ↓ ↙
    public static int[] dy = {1, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        size = 19;
        board = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        winFlag = 0; // 0 : 승부 결정 X, 1 : 검은색, 2 : 흰색
        // 1 : 검은 바둑알, 2 : 흰 바둑알
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1 || board[i][j] == 2) winCheck(i, j);
            }
        }

        System.out.println(winFlag);

        if (winFlag == 1 || winFlag == 2) {
            System.out.println(xAns + " " + yAns);
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < size && 0 <= y && y < size;
    }

    public static void winCheck(int x, int y) {
        int color = board[x][y]; // 현재 칸의 바둑알 색상 (1: 검은색, 2: 흰색)

        // 진행방향 찾기 - 총 4방향만 검사하면 됨 (→, ↘, ↓, ↙)
        for (int dir = 0; dir < 4; dir++) {
            int cnt = 1; // 총 5개의 오목이 연속되게 정렬되어야 함 + 승리인 경우, 3번째 오목의 좌표 저장       

            // 현재 좌표부터 시작
            int curX = x;
            int curY = y;

            // 같은 방향으로 4칸 더 이동하며 검사 (총 5개가 되는지 확인)
            for (int j = 0; j < 4; j++) {
                curX += dx[dir];
                curY += dy[dir];

                // 바둑판을 벗어났거나 같은 색상이 아닌 경우, 탈출
                if (!inRange(curX, curY) || board[curX][curY] != color) {
                    // System.out.println("탈출! x = " + curX + ", y = " + curY + ", dir = " + dir);
                    break;
                } else { // 바둑판 안이고 같은 색상인 경우, 카운트 + 1
                    cnt++;
                    // if (cnt == 3) {
                    //     xAns = curX + 1;
                    //     yAns = curY + 1;
                    // }
                }
            }
            
            // for문을 끝낸 후 cnt 가 5인 경우, 승리한 것이므로 color 초기화
            if (cnt == 5) {
                winFlag = color;
                xAns = x + dx[dir] * 2 + 1;
                yAns = y + dy[dir] * 2 + 1;
                return;
            }
        }        
    }
}