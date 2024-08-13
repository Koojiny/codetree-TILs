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
        
        int month = m1, day = d1;
        int elapsedDays = 1;

        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while(true) {
            if(month == m2 && day == d2)
                break;
        
            elapsedDays++;
            day++;
        
            if(day > numOfDays[month]) {
                month++;
                day = 1;
            }
        }
        
        System.out.print(elapsedDays);
    }
}