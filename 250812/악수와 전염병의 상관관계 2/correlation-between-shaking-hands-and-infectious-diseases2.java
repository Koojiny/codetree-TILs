import java.util.*;
import java.io.*;

public class Main {
    public static int N, K, P, T, shakeCnt;
    public static int[] remainSpread; // 개발자별 총 전염 가능 횟수
    public static boolean[] isInfected; // 개발자 전염 확인 배열

    public static Shake[] shakeHands;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 개발자 수
        K = Integer.parseInt(st.nextToken()); // 각 개발자가 전염 가능한 총 악수 횟수
        P = Integer.parseInt(st.nextToken()); // 전염 시작 개발자
        T = Integer.parseInt(st.nextToken()); // 총 악수 횟수
        
        remainSpread = new int[N + 1];
        isInfected = new boolean[N + 1];
        remainSpread[P] = K;
        isInfected[P] = true;
        

        shakeHands = new Shake[251];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            shakeHands[i] = new Shake(t, x, y);
        }

        Arrays.sort(shakeHands, 0, T);
        // for (int i = 0; i < T; i++) {
        //     System.out.print(shakeHands[i].time + " ");
        // }
        
        // T회 동안 시간순서대로 돌며 감염시키기
        for (int i = 0; i < T; i++) {
            int x = shakeHands[i].x;
            int y = shakeHands[i].y;

            shakeHands(x, y);
        }

        for (int i = 1; i < N + 1; i++) {
            if (isInfected[i]) System.out.print(1);
            else System.out.print(0);
        }
    }

    public static void shakeHands(int x, int y) {
        if (isInfected[x] && remainSpread[x] > 0) {
            if (!isInfected[y]) {
                isInfected[y] = true;
                remainSpread[y] = K;
            }
            remainSpread[x]--;
        } else if (isInfected[y] && remainSpread[y] > 0) {
            if (!isInfected[x]) {
                isInfected[x] = true;
                remainSpread[x] = K;
            }
            remainSpread[y]--;
        }
    }
}

class Shake implements Comparable<Shake> {
    int time;
    int x;
    int y;

    public Shake(int time, int x, int y) {
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Shake other) {
        return this.time - other.time;
    }
}