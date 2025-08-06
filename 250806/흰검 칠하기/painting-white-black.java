import java.util.*;
import java.io.*;

public class Main {
    public static char[][] tile;
    public static int curIdx, line;
    public static char[] lastColor;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int offset = 200001;
        // int offset = 13;
        tile = new char[n][offset];
        lastColor = new char[offset];
        curIdx = 100001;
        // curIdx = 6;
        line = 0;
        
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);

            coloringTile(x, dir);
        }
        
        int wCount = 0;
        int bCount = 0;
        int gCount = 0;
        for (int j = 0; j < offset; j++) {
            int blackCnt = 0;
            int whiteCnt = 0;
            for (int i = 0; i < n; i++) {                
                if (tile[i][j] == 'B') blackCnt++;
                if (tile[i][j] == 'W') whiteCnt++;
            }
            if (blackCnt >= 2 && whiteCnt >= 2) gCount++;
            else {
                if (lastColor[j] == 'W') wCount++;
                if (lastColor[j] == 'B') bCount++;
            }
        }

        System.out.println(wCount + " " + bCount + " " + gCount);
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < offset; j++) {
        //         if (tile[i][j] == 0) System.out.print("0");
        //         System.out.print(tile[i][j] + "  ");
        //     }
        //     System.out.println();
        // }
    }

    public static void coloringTile(int x, char dir) {
        if (dir == 'R'){
            for (int i = curIdx; i < curIdx + x; i++) {
                tile[line][i] = 'B';
                lastColor[i] = 'B';
            }
            if (x > 1) curIdx += x - 1;
            line++;
        } else {
            for (int i = curIdx; i > curIdx - x; i--) {
                tile[line][i] = 'W';
                lastColor[i] = 'W';
            }
            if (x > 1) curIdx -= x - 1;
            line++;
        }
    }
}