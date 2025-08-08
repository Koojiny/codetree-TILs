import java.util.*;
import java.io.*;

public class Main {
    public static int[] tile;
    public static int curIdx;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        tile = new int[200001];
        curIdx = 100001;


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            coloringTile(x, dir);
        }

        int whiteCnt = 0;
        int blackCnt = 0;
        for (int i = 0; i < 200001; i++) {
            if (tile[i] == 1) whiteCnt++;
            else if (tile[i] == 2) blackCnt++; 
        }

        System.out.println(whiteCnt + " " + blackCnt);
    }

    // 흰색 : 1, 검은색 : 2
    public static void coloringTile(int x, char dir) {
        if (dir == 'R') {
            for (int i = curIdx; i < curIdx + x; i++) {
                tile[i] = 2;
            }
            curIdx += x - 1;
        } else {
            for (int i = curIdx; i > curIdx - x; i--) {
                tile[i] = 1;
            }
            curIdx -= x - 1;
        }
    }
}