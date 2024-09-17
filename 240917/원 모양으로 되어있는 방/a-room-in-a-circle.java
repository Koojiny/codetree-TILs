import java.io.*;
import java.util.*;
public class Main {
    static int N;
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] people = new int[N * 2];

        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }
        for (int i = N; i < people.length; i++) {
            people[i] = people[i % N];
        }

        int answer = Integer.MAX_VALUE;
        
        for (int start = 0; start < N; start++) {
            int sum = 0;
            int cnt = 1;
            for (int j = start + 1; j < people.length; j++) {
                if (cnt == N) break;
                sum += people[j - 1] * (j - start);
                cnt++;
            }
            answer = Math.min(sum, answer);
        }
        System.out.println(answer);
    }
}