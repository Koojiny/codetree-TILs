import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        //System.out.println(numOfDays(m2, d2) - numOfDays(m1, d1));
        System.out.println(whatDay(numOfDays(m2, d2) - numOfDays(m1, d1)));
    }

    public static int numOfDays(int m, int d) {
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totaldays = 0;

        for (int i = 0; i < m - 1; i++) {
            totaldays += days[i];
        }
        totaldays += d;

        return totaldays;
    }

    public static String whatDay(int n) {
        String[] wDays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        while (n < 0) {
            n += 7;
        }

        return wDays[n % 7];
    }
}