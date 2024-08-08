import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(st.nextToken());
            
            if (a < 250) {
                arr[i] = a;
            } else break;
        }
        
        int sum = 0;
        int cnt = 0;
        double avg = 0;
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) {
                sum += arr[i];    
                cnt++;
            }
        }
        avg = sum / (double)cnt; 

        System.out.printf("%d %.1f", sum, avg);
    }
}