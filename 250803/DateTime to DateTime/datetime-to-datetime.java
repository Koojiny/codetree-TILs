import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int result = calcTime(a, b, c) - calcTime(11, 11, 11);
        if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    public static int calcTime(int day, int hour, int min) {
        int totalTime = day * 60 * 24 + hour * 60 + min;
        
        return totalTime;
    }
}