import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        System.out.println(checkSeason(checkDate(y, m, d)));
    }

    public static int checkDate(int year, int month, int day) {
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 1. 윤년 체크
        if (lunarCheck(year)) {
            if (month == 2) {
                if (day > 29) {
                    return -1;
                } else {
                    return month;
                }
            } else {
                if (days[month - 1] < day) {
                    return -1;
                } else return month;
            }
        }
        else {
            if (days[month - 1] < day) {
                return -1;
            } else return month;
        }
    }

    public static String checkSeason(int n) {
        if (n == -1) return "-1";
        if (n >= 3 && n <= 5) return "Spring";
        if (n >= 6 && n <= 8) return "Summer";
        if (n >= 9 && n <= 11) return "Fall";
        else return "Winter";
    }

    public static boolean lunarCheck(int year) {
        if (year % 4 == 0) return true;
        else if (year % 4 == 0 && year % 100 == 0) return false;
        else if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) return true;
        else return false;
    }
}