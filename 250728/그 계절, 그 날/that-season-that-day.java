import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        if (!checkDay(y, m, d)) {
            System.out.println(-1);
            return;
        }

        String season = checkWeather(m);
        System.out.println(season);
    }

    public static String checkWeather(int m) {
        if (m == 12 || m == 1 || m == 2) return "Winter";
        else if (m == 3 || m == 4 || m == 5) return "Spring";
        else if (m == 6 || m == 7 || m == 8) return "Summer";
        else return "Fall";
    }

    public static boolean checkDay(int y, int m, int d) {
        if (m < 1 || m > 12) return false;

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (lunarYear(y)) {
            days[2] = 29;
        }

        return d >= 1 && d <= days[m];
    }

    public static boolean lunarYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}