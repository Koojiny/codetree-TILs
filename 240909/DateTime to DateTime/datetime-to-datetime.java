import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int dayTime = (a - 11) * 24 * 60;
        int hourTime = (b - 11) * 60;
        int minTime = c;
        int tmpMin = 11;
        int totalMin = dayTime + hourTime + minTime - tmpMin;

        if (totalMin >= 0) System.out.print(dayTime + hourTime + minTime - tmpMin);
        else System.out.print(-1);
    }
}