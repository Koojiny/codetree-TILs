import java.io.*;
import java.util.*;

public class Main {
    public static final int N_large = 5; // 전체 격자 크기
    public static final int N_small = 3; // 회전 격자 크기

    static class Board {
        int[][] arr = new int[N_large][N_large];

        // 생성자
        public Board() {
            for (int i = 0; i < N_large; i++) {
                for (int j = 0; j < N_large; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // 주어진 y, x 전체 격자 범위 안에 있는지 확인
        private boolean inRange(int y, int x) {
            return 0 <= y && y < N_large && 0 <= x && x < N_large;
        }

        // 현재 격자에서 sy,sx를 좌측 상단으로 하여 시계방향 90도 회전을 cnt번 시행했을 때 결과 return
        public Board rotate(int sy, int sx, int cnt) {
            Board result = new Board();
            // 전체 격자 초기화 후 현재 격자에 있는 값으로 채운다
            for (int i = 0; i < N_large; i++) {
                for (int j = 0; j < N_large; j++) {
                    result.arr[i][j] = this.arr[i][j];
                }
            }

            for (int k = 0; k < cnt; k++) {
                // sy, sx를 좌측상단으로 하여 시계방향 90도 회전
                int tmp = result.arr[sy + 0][sx + 2]; // 각 모서리 값부터 회전
                result.arr[sy + 0][sx + 2] = result.arr[sy + 0][sx + 0];
                result.arr[sy + 0][sx + 0] = result.arr[sy + 2][sx + 0];
                result.arr[sy + 2][sx + 0] = result.arr[sy + 2][sx + 2];
                result.arr[sy + 2][sx + 2] = tmp;

                tmp = result.arr[sy + 2][sx + 1]; // 나머지 십자모양에 있는 값들 회전
                result.arr[sy + 2][sx + 1] = result.arr[sy + 1][sx + 2];
                result.arr[sy + 1][sx + 2] = result.arr[sy + 0][sx + 1];
                result.arr[sy + 0][sx + 1] = result.arr[sy + 1][sx + 0];
                result.arr[sy + 1][sx + 0] = tmp;
            }
            return result;
        }

        // 현재 격자에서 유물 획득
        public int calScore() {
            int score = 0;
            boolean[][] visit = new boolean[N_large][N_large];
            int[] dy = {0, 1, 0, -1};
            int[] dx = {1, 0, -1, 0};

            for (int i = 0; i < N_large; i++) {
                for (int j = 0; j < N_large; j++) {
                    if (!visit[i][j]) {
                        Queue<int[]> q = new LinkedList<>();
                        Queue<int[]> trace = new LinkedList<>();

                        q.offer(new int[]{i, j});
                        trace.offer(new int[]{i, j});
                        visit[i][j] = true;

                        while (!q.isEmpty()) {
                            int[] cur = q.poll();
                            for (int k = 0; k < 4; k++) {
                                int ny = cur[0] + dy[k];
                                int nx = cur[1] + dx[k];

                                if (inRange(ny, nx) && arr[ny][nx] == arr[cur[0]][cur[1]] && !visit[ny][nx]) {
                                    q.offer(new int[]{ny, nx});
                                    trace.offer(new int[]{ny, nx});
                                    visit[ny][nx] = true;
                                }
                            }
                        }

                        if (trace.size() >= 3) {
                            score += trace.size();

                            while (!trace.isEmpty()) {
                                int[] t = trace.poll();
                                arr[t[0]][t[1]] = 0;
                            }
                        }
                    }
                }
            }

            return score;
        }

        // 새로운 유물조각을 빈 곳에 차례대로 채우기
        public void fill(Queue<Integer> q) {
            // 열이 작고 행이 큰 우선순위대로 채운다
            for (int j = 0; j < N_large; j++) {
                for (int i = N_large - 1; i >= 0; i--) {
                    if (arr[i][j] == 0 && !q.isEmpty()) {
                        arr[i][j] = q.poll();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        Board board = new Board();

        // 전체 격자 채우기
        for (int i = 0; i < N_large; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N_large; j++) {
                board.arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 큐에 M개의 유물 조각 값 채우기
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            que.offer(Integer.parseInt(st.nextToken()));
        }

        // 탐사 시작
        // K번 탐사 진행
        while (K-- > 0) {
            int maxScore = 0;
            Board maxScoreBoard = null;
            // 모두 통과한 최대 획득 가치의 결과를 maxScoreBoard에 저장
            // (1) 유물 1차 획득 가치 최대화
            // (2) 회전한 각도 가장 작은 방법 선택
            // (3) 열 최소, 동일하다면 행 최소
            for (int cnt = 1; cnt <= 3; cnt++) { // 회전 횟수 1,2,3번 -> 각각 90도, 180도, 270도 회전
                for (int sx = 0; sx <= N_large - N_small; sx++) { // 최소 열부터 진행
                    for (int sy = 0; sy <= N_large - N_small; sy++) { // 최소 행부터 진행
                        Board rotated = board.rotate(sy, sx, cnt);

                        int tmpScore = rotated.calScore();

                        if (maxScore < tmpScore) {
                            maxScore = tmpScore;
                            maxScoreBoard = rotated;
                        }
                    }
                }
            }

            // 더 이상 유물이 나오지 않는다면 탐사 즉시 종료
            if (maxScoreBoard == null) break;
            
            board = maxScoreBoard;
            // 유물 연쇄 획득 진행
            // 유물 조각 채우고 유물 획득 과정 반복 (종료 조건은 유물 없는 경우)
            while (true) {
                board.fill(que);
                int newScore = board.calScore();
                if (newScore == 0) break;
                maxScore += newScore;
            }

            System.out.print(maxScore + " ");
        }
    }
}