import java.util.*;
import java.io.*;

public class Main {
    public static int curIdx, line;
    public static int[] lastColor, whiteTile, blackTile;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int offset = 200001;
        // int offset = 13;
        whiteTile = new int[offset];
        blackTile = new int[offset];
        lastColor = new int[offset];
        curIdx = 100001;
        // curIdx = 6;
        
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
            if (blackTile[j] >= 2 && whiteTile[j] >= 2) gCount++;
            else {
                if (lastColor[j] == 1) wCount++;
                if (lastColor[j] == 2) bCount++;
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

    // 흰색 : 1, 검은색 : 2
    public static void coloringTile(int x, char dir) {
        if (dir == 'R'){
            for (int i = curIdx; i < curIdx + x; i++) {
                blackTile[i]++;
                lastColor[i] = 2;
            }
            if (x > 1) curIdx += x - 1;
        } else {
            for (int i = curIdx; i > curIdx - x; i--) {
                whiteTile[i]++;
                lastColor[i] = 1;
            }
            if (x > 1) curIdx -= x - 1;
        }
    }
}