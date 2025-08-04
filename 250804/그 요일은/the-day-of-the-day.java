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
        String targetDay = br.readLine();

        int diff = calcDay(m2, d2) - calcDay(m1, d1) + 1;
        
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Map<String, Integer> dayMap = new HashMap<>();
        for (int i = 0; i < 7; i++) dayMap.put(days[i], i);

        int startDayIndex = 0; // m1/d1은 Mon이므로 index 0
        int totalDays = calcDay(m2, d2) - calcDay(m1, d1) + 1;

        int fullWeeks = totalDays / 7;
        int extraDays = totalDays % 7;

        int targetIdx = dayMap.get(targetDay);
        int count = fullWeeks;

        // 나머지 extraDays 만큼의 요일 확인
        for (int i = 0; i < extraDays; i++) {
            if ((startDayIndex + i) % 7 == targetIdx) {
                count++;
                break; // 딱 한 번만 더 추가됨
            }
        }

        System.out.println(count);
    }

    public static int calcDay(int m, int d) {
        int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 1; i < m; i++) {
            totalDays += days[i];
        }

        totalDays += d;

        return totalDays;
    }
}