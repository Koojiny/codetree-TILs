import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        // String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int diff = calcDay(m2, d2) - calcDay(m1, d1);
        // while (diff < 0) {
        //     diff += 7;
        // }
        
        // System.out.println(day[diff % 7]);
        System.out.println(day[(1 + diff % 7 + 7) % 7]);
    }

    public static int calcDay(int m, int d) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }

        totalDays += d;

        return totalDays;
    }
}