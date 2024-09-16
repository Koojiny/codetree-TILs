import java.util.*;
import java.io.*;

public class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        List<int[]> checkPoints = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cp = new int[2];
            cp[0] = Integer.parseInt(st.nextToken());
            cp[1] = Integer.parseInt(st.nextToken());
            checkPoints.add(cp);
        }
        
        int answer = Integer.MAX_VALUE;
        
        for (int i = 1; i < checkPoints.size() - 1; i++) {
            int sum = 0;
            int prev = 0;
            for (int j = 1; j < checkPoints.size(); j++) {
                if (i == j) continue;
                int x1 = checkPoints.get(prev)[0];
                int y1 = checkPoints.get(prev)[1];
                int x2 = checkPoints.get(j)[0];
                int y2 = checkPoints.get(j)[1];
                
                sum += Math.abs(x1 - x2) + Math.abs(y1 - y2);
                prev = j;
            }
            
            answer = Math.min(answer, sum);
            // temp += Math.abs(x1 - x2) + Math.abs(y1 - y2);
        }      
        
        System.out.println(answer);
    }
}