import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());

        // System.out.println(calcTime(h1, m1, h2, m2));
        System.out.println(calcTime2(h2, m2) - calcTime2(h1, m1));
    }

    public static int calcTime(int h1, int m1, int h2, int m2) {
        int time = 0;
        int hour = h1;
        int mins = m1;

        while (true) {
            if (hour == h2 && mins == m2) break;

            time++;
            mins++;

            if (mins == 60) {
                hour++;
                mins = 0;
            }
        }

        return time;
    }

    public static int calcTime2(int h, int m) {
        
        return h * 60 + m;
    }
}